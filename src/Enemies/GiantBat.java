package Enemies;

public class GiantBat extends Monster {
    public GiantBat() {
        super(100);
    }

    public int attack(){
        System.out.println(super.toString());
        return 0;
    }

    @Override
    public String toString() {
        return "H";
    }
}
