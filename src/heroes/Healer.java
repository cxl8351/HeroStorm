package heroes;

import game.Team;

/**
 * The class Healer
 * Healer is a class of Hero
 *
 * @author Christopher Lee - cxl8351
 */
public class Healer extends Hero{
    private int HEALER_HIT_POINTS = 35;
    private int HEAL_AMOUNT = 10;
    private int DAMAGE_AMOUNT = 10;
    private Party party;

    Healer(Team team, Party party){
        super(Heroes.getName(team,Heroes.Role.HEALER),35,35);
        this.party = party;

    }

    @Override
    public Heroes.Role getRole() {
        return Heroes.Role.HEALER;
    }

    @Override
    public void attack(Hero enemy) {
        this.heal(HEAL_AMOUNT);
        for(Hero hero : this.party.getHeroes()){
            hero.heal(HEAL_AMOUNT);
        }
        enemy.takeDamage(DAMAGE_AMOUNT);
    }
}
