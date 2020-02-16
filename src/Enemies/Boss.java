package Enemies;

public abstract class Boss extends Enemy{
    private int numPhases;

    public Boss(int maxHealth, int numPhases) {
        super(maxHealth);
    }


}
