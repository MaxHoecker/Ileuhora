package Potions;

public class HealingPotionS extends Potion {
    public HealingPotionS() {
        super(10, "Healing", 10, "small healing potion");
    }

    @Override
    protected HealingPotionS clone() throws CloneNotSupportedException {
        return new HealingPotionS();
    }
}
