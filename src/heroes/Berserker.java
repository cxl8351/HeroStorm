package heroes;

import game.Team;

/**
 * The class Berserker.
 * Berserker is a class of Hero
 *
 * @author Christopher Lee - cxl8351
 */
public class Berserker extends Hero {
    private int BERSERKER_HIT_POINTS = 30;
    private int DAMAGE_AMOUNT = 20;

    /**
     * Constructor for Berserker
     *
     * @param team the team to correlate the berserker with
     */
    protected Berserker(Team team){
        super(Heroes.getName(team, Heroes.Role.BERSERKER),30,30);
    }

    /**
     * Get the role of Berserker
     *
     * @return the role
     */
    @Override
    public Heroes.Role getRole(){
        return Heroes.Role.BERSERKER;
    }

    /**
     * Attacks an enemy
     *
     * @param enemy the enemy to be attacked
     */
    @Override
    public void attack(Hero enemy){
        enemy.takeDamage(DAMAGE_AMOUNT);
    }
}

