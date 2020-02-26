package Enemies;

public class GiantBat extends Monster {
    public GiantBat() {
        super(100);
    }

    public int attack(){
        return 10;
    }

    @Override
    public String toString() {
        return "I am a giant bat";
    }
}
