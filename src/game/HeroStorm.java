package game;

import heroes.Hero;

/**
 * The game Hero Storm.
 *
 * @author Christopher Lee - cxl8351
 */
public class HeroStorm {
    private HeroParty DragonParty;
    private HeroParty LionParty;


    HeroStorm(int dragonSeed, int lionSeed){
        DragonParty = new HeroParty(Team.DRAGON, dragonSeed);
        LionParty = new HeroParty(Team.LION, lionSeed);
    }

    /**
     * Plays the game.
     *
     */
    public void play(){

        System.out.println("Heroes Storm!");

        int round = 0;
        boolean DragonFirst = true;

        while(DragonParty.numHeroes() > 0 || LionParty.numHeroes() > 0){
            ++round;
            //Round ... !
            System.out.println("=====================================");
            System.out.println("ROUND " + round + "!");

            //DRAGON TEAM
            System.out.println(DragonParty.getTeam() + ":");
            System.out.println(DragonParty.toString());

            System.out.println(" ");

            //LION TEAM
            System.out.println(LionParty.getTeam() + ":");
            System.out.println(LionParty.toString());

            System.out.println(" ");

            //Remove the two 'front' heroes from both teams.
            Hero DragonHero = DragonParty.removeHero();
            Hero LionHero = LionParty.removeHero();

            if(DragonFirst == true){
                System.out.println("-<" + DragonHero.getName() + ">- VS. -<" + LionHero.getName() + ">-");

                //Dragon attacks first
                DragonHero.attack(LionHero);


                if(!LionHero.hasFallen()){

                    LionHero.attack(DragonHero);

                    if(!DragonHero.hasFallen()){
                        DragonParty.addHero(DragonHero);
                    }
                    else{
                        System.out.println(DragonHero.getName() + " has fallen by: " + LionHero.getName());
                    }

                    LionParty.addHero(LionHero);
                }
                else{
                    System.out.println(LionHero.getName() + " has fallen by: " + DragonHero.getName());
                }
                DragonFirst = false;
            }
            else {
                System.out.println("-<" + LionHero.getName() + ">- VS. -<" + DragonHero.getName() + ">-");

                LionHero.attack(DragonHero);

                if (!DragonHero.hasFallen()) {
                    DragonHero.attack(LionHero);
                    if (!LionHero.hasFallen()) {
                        LionParty.addHero(LionHero);
                    } else {
                        System.out.println(LionHero.getName() + " has fallen by: " + DragonHero.getName());
                    }
                    DragonParty.addHero(DragonHero);
                } else {
                    System.out.println(DragonHero.getName() + " has fallen by: " + LionHero.getName());
                }
                DragonFirst = true;
            }

        }
        System.out.println("");
        if(LionParty.numHeroes() != 0 && DragonParty.numHeroes() == 0){
            System.out.println("=====================================");
            System.out.println("TEAM LION IS VICTORIOUS!!");
            System.out.println("=====================================");
        }
        else{
            System.out.println("=====================================");
            System.out.println("TEAM DRAGON IS VICTORIOUS!!");
            System.out.println("=====================================");
        }
    }

    /**
     * Main function, calls play()
     *
     * @param args
     */
    public static void main(String[] args){

        int dragonSeed = Integer.parseInt(args[0]);
        int lionSeed = Integer.parseInt(args[1]);

        HeroStorm myGame = new HeroStorm(dragonSeed, lionSeed);

        myGame.play();
    }
}
