package game;

import heroes.Hero;
import heroes.Heroes;
import heroes.Party;

import java.util.*;

/**
 * HeroParty creates a "party," filled with heroes.
 * ArrayLists are representative of a party.
 *
 * @author Christopher Lee - cxl8351
 */
public class HeroParty extends Object implements Party {

    private ArrayList<Hero> heroParty;
    private Team team;

    public HeroParty(Team team, int seed){
        heroParty = new ArrayList<>();
        this.team = team;

        Hero berserker = Hero.create(Heroes.Role.BERSERKER,team,this);
        Hero healer = Hero.create(Heroes.Role.HEALER,team,this);
        Hero tank = Hero.create(Heroes.Role.TANK,team,this);

        this.heroParty.add(berserker);
        this.heroParty.add(healer);
        this.heroParty.add(tank);

        Collections.shuffle(this.heroParty,new Random(seed));
    }

    /**
     * Adds a hero to the party
     *
     * @param hero the new hero
     */
    @Override
    public void addHero(Hero hero) {
        this.heroParty.add(hero);
    }

    /**
     * Removes the first hero of the party
     *
     * @return the hero removed
     */
    @Override
    public Hero removeHero() {
        return this.heroParty.remove(0);
    }

    /**
     * Returns the size of a party
     *
     * @return the size of the party
     */
    @Override
    public int numHeroes() {
        return this.heroParty.size();
    }

    /**
     * Returns the team of a party
     *
     * @return the team
     */
    @Override
    public Team getTeam() {
        return this.team;
    }

    /**
     * Returns the party itself (ArrayList)
     *
     * @return the party
     */
    @Override
    public List<Hero> getHeroes() {
        return this.heroParty;
    }

    /**
     * Every hero in the party as a string.
     *
     * @return nothing - but print every hero
     */
    @Override
    public String toString(){
        for(Hero hero: this.heroParty) {
            System.out.println(hero.toString());
        }
        return "";
    }
}
