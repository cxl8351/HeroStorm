package heroes;

import game.Team;

public class Tank extends Hero {

    private int TANK_HIT_POINTS = 40;
    private double SHIELD_DMG_MULTIPLIER = 0.9;
    private int DAMAGE_AMOUNT = 15;

    public Tank(Team team){
        super(Heroes.getName(team, Heroes.Role.TANK),40,40);
    }

    @Override
    public Heroes.Role getRole(){
        return Heroes.Role.TANK;
    }

    @Override
    public void attack(Hero enemy){
        enemy.takeDamage(DAMAGE_AMOUNT);
    }

    @Override
    public void takeDamage(int amount){
        super.takeDamage(amount*=SHIELD_DMG_MULTIPLIER);
    }
}
