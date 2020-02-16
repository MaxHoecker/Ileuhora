import Potions.HealingPotionS;
import Potions.Potion;
import Interfaces.Item;
import Weapons.Weapon;
import Weapons.WoodenSword;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);

        System.out.println(entryMessage);
        boolean newWares = stockShop1();
        if (newWares){
            System.out.println("Boy have we got some new stuff for you!");
        }
        boolean runShop = true;
        while(runShop){
            System.out.println(navigationMessage(player));
            String input = scan.nextLine();
            input = input.toLowerCase();
            switch (input){
                case "exit":
                    runShop = false;
                    break;
                case "heals":
                    Potion healing = new HealingPotionS();

                    break;
                case "wood":
                    break;
                case "s":
                    break;
            }
        }
        System.out.println("Stop by again later!");
    }

    public boolean stockShop1(){
        Weapon wood = new WoodenSword();
        boolean stockedWeapon = addWeaponToShop(wood);

        Potion heal1 = new HealingPotionS();
        boolean stockedPotion = addPotionToShop(heal1);

        boolean stocked = stockedWeapon || stockedPotion;
        return stocked;
    }

    /**
     * =====================================================================
     *                   item management
     * =====================================================================
     */
    public boolean containsItem(Item item){
        if(item instanceof Potion){
            for (int i = 0; i < availablePotions.size(); i++){
                if(availablePotions.get(i).equals(item)){
                    return true;
                }
            }
            return false;
        }
        else if(item instanceof Weapon){
            for (int i = 0; i < availableWeapons.size(); i++){
                if(availableWeapons.get(i).equals(item)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean purchaseItem(Item item, Player player){
        if(!containsItem(item)){
            return false;
        }
        if(!availableFunds(item, player)){
            return false;
        }
        if(item instanceof Potion){
            player.addPotion((Potion)item);
        }
        else if (item instanceof Weapon){
            player.addWeapon((Weapon)item);
        }
        else return false;

        return true;
    }


    public boolean availableFunds(Item item, Player player){
        if(player.getMoney() > item.getCost()){
            return true;
        }
        return false;
    }

    public boolean addWeaponToShop(Weapon weapon){
        if(containsItem(weapon)){
            return false;
        }
        availableWeapons.add(weapon);
        return true;
    }

    public boolean addPotionToShop(Potion potion){
        if(containsItem(potion)){
            return false;
        }
        availablePotions.add(potion);
        return true;
    }

    /**
     * =====================================================================
     *                      printing the shop management
     * =====================================================================
     */

    public String navigationMessage(Player player){
        String commands = "";
        commands += "\n*==============================*\n";
        commands += "------------------------\n";
        commands += "*Take a pick from our finest wares \n";
        commands += "------------------------\n\n";
        commands += toString();
        commands += "\n------------------------\n";
        commands += "*Your money is " + player.getMoney() + " gold pieces";
        commands += "\n------------------------\n";
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
