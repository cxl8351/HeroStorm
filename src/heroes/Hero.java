package heroes;

public class Hero {
    private String name;
    private int HP;

    Hero(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public Hero create(heroes.Heroes.Role Role,game.Team Team,Party Party){
        return null;
    }

    public heroes.Heroes.Role getRole(){
        return null;
    }

    public void attack(Hero enemy){

    }

    public String getName(){
        return "";
    }

    public void heal(int amount){

    }

    public void takeDamage(int amount){

    }

    public boolean hasFallen(){
        return false;
    }

    public String toString(){
        return "";
    }
}
