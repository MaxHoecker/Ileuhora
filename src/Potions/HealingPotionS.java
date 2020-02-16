package Potions;

public class HealingPotionS extends Potion {
    public HealingPotionS() {
        super(10, "Healing", 10, "healing small", "just a small healing potion");
    }

    @Override
    public HealingPotionS clone() throws CloneNotSupportedException {
        return new HealingPotionS();
    }
}
