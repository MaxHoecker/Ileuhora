package Potions;

public abstract class Potion {
    private int potency;
    private String effect;
    private int cost;

    public Potion(int potency, String effect, int cost) {
        this.potency = potency;
        this.effect = effect;
        this.cost = cost;
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

    @Override
    public String toString() {
        String result = "";
        result += "Effect: " + effect + "     ";
        result += "Potency: " + potency + "     ";
        result += "Value: " + cost + "     ";
        return result;
    }
}
