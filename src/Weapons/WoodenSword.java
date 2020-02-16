package Weapons;

public class WoodenSword extends Weapon implements Sword{
    public WoodenSword() {
        super("Wooden Sword", 1, 6, 0, "might as well have picked it off the side of the road");
    }

    public int slash(){
        return 0;
    }

    public int stab(){
        return 0;
    }
}
