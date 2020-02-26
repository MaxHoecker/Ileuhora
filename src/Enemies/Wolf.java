package Enemies;

public class Wolf extends Monster {

    public Wolf() {
        super(100);
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String toString() {
        return "I amst a wolf";
    }
}
