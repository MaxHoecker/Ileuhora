package Enemies;

public abstract class Monster extends Enemy{
    public Monster(int maxHealth) {
        super(maxHealth);
    }

    @Override
    public String toString() {
        return "G";
    }
}
