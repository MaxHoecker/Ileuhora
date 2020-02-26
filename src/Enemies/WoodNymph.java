package Enemies;

public class WoodNymph extends Monster {
    public WoodNymph() {
        super(200);
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String toString() {
        return "Me a wood nymph";
    }
}
