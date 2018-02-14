package heroes;

/**
 * Abstract class Hero
 * The fundamental class to create other types of heroes
 *
 * @author Christopher Lee - cxl8351
 */
public abstract class Hero {
    private String name;
    private int HP;
    private int maxHP;

    /**
     * Constructor for a hero
     *
     * @param name name of the hero
     * @param HP current HP of the hero
     * @param maxHP Maximum HP of the hero
     */
    protected Hero(String name, int HP,int maxHP){
        this.name = name;
        this.HP = HP;
        this.maxHP = maxHP;
    }

    /**
     * Creates a new hero
     *
     * @param Role The role of the hero
     * @param Team The team of the hero
     * @param Party The party of the hero
     * @return The new hero made
     */
    public static Hero create(heroes.Heroes.Role Role,game.Team Team,Party Party){
        if (Role == Role.BERSERKER){
            return new Berserker(Team);
        }
        else if (Role == Role.HEALER){
            return new Healer(Team,Party);
        }
        else if (Role == Role.TANK){
            return new Tank(Team);
        }
        return null;
    }

    /**
     * Declaration of getRole()
     *
     * @return
     */
    public abstract Heroes.Role getRole();

    /**
     * Declaration of attack
     *
     * @param enemy
     */
    public abstract void attack(Hero enemy);

    /**
     * Gets the name of a hero
     *
     * @return the name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Heals a hero
     *
     * @param amount the amount a hero is healed by
     */
    public void heal(int amount){
        for(int i = 0; i < amount; i++){
            if(HP < maxHP){
                HP += 1;
            }
        }
        System.out.println(this.getName() + " heals " + amount + " points");

    }

    /**
     *
     *
     * @param amount
     */
    public void takeDamage(int amount){
        this.HP -= amount;
        if(this.HP <= 0) {
            this.HP = 0;
        }
        System.out.println(this.getName() + " takes " + amount + " damage");
    }

    public boolean hasFallen(){
        if(this.HP <= 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return this.name + ", " + getRole() + ", " + this.HP + "/" + this.maxHP;
    }
}
