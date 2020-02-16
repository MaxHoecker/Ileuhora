package Potions;

import Interfaces.Item;

public abstract class Potion implements Item {
    private int potency;
    private String effect;
    private int cost;
    private String name;

    public Potion(int potency, String effect, int cost, String name) {
        this.potency = potency;
        this.effect = effect;
        this.cost = cost;
        this.name = name;
    }

    public int getPotency(){
        return potency;
    }

    public String getEffect(){
        return effect;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Potion)) {
            return false;
        }
        if(((Potion) obj).effect.equals(this.effect) && ((Potion) obj).potency == potency){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Effect: " + effect + "     ";
        result += "Potency: " + potency + "     ";
        result += "Value: " + cost + "     ";
        return result;
    }
}
