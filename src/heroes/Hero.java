package heroes;

public class Hero {
    private String name;
    private int HP;

    Hero(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public static Hero create(heroes.Heroes.Role Role,game.Team Team,Party Party){
        return null;
    }

    public static heroes.Heroes.Role getRole(){
        return null;
    }

    public static void attack(Hero enemy){

    }

    public static String getName(){
        return "";
    }

    public static void heal(int amount){

    }

    public static void takeDamage(int amount){

    }

    public static boolean hasFallen(){
        return false;
    }

    public String toString(){
        return "";
    }
}
