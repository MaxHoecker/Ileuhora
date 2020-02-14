package Weapons;
import java.util.Random;

public abstract class Weapon {
    private String name;
    private int baseDmg;
    private int dmgRange;
    private int cost;
    private String description;
    private Random rand;

    public Weapon(String name, int baseDmg, int dmgRange, int cost, String description) {
        this.name = name;
        this.baseDmg = baseDmg;
        this.dmgRange = dmgRange;
        this.cost = cost;
        this.description = description;
        rand = new Random();
    }

    public int attack(){
        return rand.nextInt(dmgRange) + baseDmg;
    }

    @Override
    public String toString() {
        String result = "\n";
        result += name;
        result += "Damage range: " + baseDmg + "-" + (baseDmg + dmgRange);
        result += "Value: " + cost;

        return result;
    }
}