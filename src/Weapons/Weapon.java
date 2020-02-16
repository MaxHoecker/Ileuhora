package Weapons;
import Interfaces.Item;

import java.util.Random;

public abstract class Weapon implements Item {
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

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public int attack(){
        return rand.nextInt(dmgRange) + baseDmg;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Weapon){
            if(((Weapon) obj).name.equals(name)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Weapon clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        result += name + "     ";
        result += "Damage range: " + baseDmg + "-" + (baseDmg + dmgRange) + "     ";
        result += "Value: " + cost + "     ";

        return result;
    }
}
