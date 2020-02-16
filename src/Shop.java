import Potions.HealingPotionS;
import Potions.Potion;
import Weapons.Weapon;
import Weapons.WoodenSword;

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
        boolean newWares = stockShop1();
        if (newWares){
            System.out.println("Boy have we got some new stuff for you!");
        }
        boolean runShop = true;
        while(runShop){
            toString();
            navigationMessage(player);
        }


    }

    public boolean stockShop1(){
        Weapon wood = new WoodenSword();
        boolean stockedWeapon = addWeaponToShop(wood);

        Potion heal1 = new HealingPotionS();
        boolean stockedPotion = addPotionToShop(heal1);

        boolean stocked = stockedWeapon || stockedPotion;
        return stocked;
    }

    public boolean addWeaponToShop(Weapon weapon){
        for (int i = 0; i < availableWeapons.size(); i++){
            if(availableWeapons.get(i).equals(weapon)){
                return false;
            }
        }
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

    public String navigationMessage(Player player){
        String commands = "";
        int phase = player.getPhase();
        commands += "\n*==============================*\n";
        if (phase <= 1){
            commands += "------------------------\n";
            commands += "*Choose your weapon \n";
            commands += "------------------------\n\n";
            commands += "*nothing\n\n";
            commands += "*wood sword cost = 0 \n base damage = 1 - 7 \n\n";
            commands += "*iron sword cost = 100 \n base damage = 8 - 15 \n\n";
        }
        if (phase == 2){
            commands += "*steel sword cost = 500 \n base damage = 16 - 23 \n\n";
            commands += "*silver sword cost = 2000 \n base damage = 16 - 23 \n\n";
            commands += "*keybrand R cost = 5000 \n base damage = 500 - 507 \n\n";
            commands += "*blight oblivion cost = 12000 \\n base damage = 150 \\n\"\n";
        }
        commands += "------------------------\n";
        commands += "*Your money is " + player.getMoney() + " gold pieces\n";
        commands += "------------------------\n\n";
        commands += "\n*==============================*\n\n";
        return commands;
    }

    @Override
    public String toString() {
        String result = "";
        result += "===============Weapons===============\n";
        for (int i = 0; i < availableWeapons.size(); i++) {
            result += availableWeapons.get(i).toString();
            result += "\n";
        }
        result += "===============Potions===============\n";
        for (int i = 0; i < availablePotions.size(); i++) {
            result += availablePotions.get(i).toString();
            result += "\n";
        }
        return result;
    }
}
