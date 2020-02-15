import Potions.Potion;
import Weapons.Weapon;

import java.util.ArrayList;

public class Shop {

    private String entryMessage;
    private ArrayList<Weapon> availableWeapons;
    private ArrayList<Potion> availablePotions;

    public Shop(String entryMessage) {
        this.entryMessage = entryMessage;
        this.availableWeapons = new ArrayList<Weapon>();
        this.availablePotions = new ArrayList<Potion>();
    }

    public void runShop(Player player){

    }
}
