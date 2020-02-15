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
        System.out.println(entryMessage);

    }

    public boolean addWeaponToShop(Weapon weapon){
        availableWeapons.add(weapon);
        return true;
    }

    public boolean addPotionToShop(Potion potion){
        for (int i = 0; i < availablePotions.size(); i++){
            if(availablePotions.get(i).equals(potion)){
                return false;
            }
        }
        availablePotions.add(potion);
        return true;
    }
}
