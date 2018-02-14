package heroes;

import game.Team;

/**
 * The role representative of tank
 * Tank is a class that extends Hero
 *
 * @author Christopher Lee - cxl8351
 */
public class Tank extends Hero {

    private int TANK_HIT_POINTS = 40;
    private double SHIELD_DMG_MULTIPLIER = 0.9;
    private int DAMAGE_AMOUNT = 15;

    /**
     * The constructor for Tank
     *
     * @param team the team to be correlated with.
     */
    public Tank(Team team){
        super(Heroes.getName(team, Heroes.Role.TANK),40,40);
    }

    /**
     * Gets the role of Tank
     *
     * @return the role
     */
    @Override
    public Heroes.Role getRole(){
        return Heroes.Role.TANK;
    }

    /**
     * Attacks an enemy hero
     *
     * @param enemy the hero to be attacked
     */
    @Override
    public void attack(Hero enemy){
        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    /**
     * Recieves damage.
     * Remark: Tanks recieve 90% of all damage
     *
     * @param amount the amount of damage to be taken
     */
    @Override
    public void takeDamage(int amount){
        super.takeDamage(amount*=SHIELD_DMG_MULTIPLIER);
    }
}
