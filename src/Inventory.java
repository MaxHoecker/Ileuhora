import Potions.*;
import Weapons.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {

    private Weapon equippedWeapon;
    private ArrayList<Weapon> weapons;
    private ArrayList<Potion> potions;
    private int money;

    public Inventory() {
        money = 0;
        weapons = new ArrayList<Weapon>();
        potions = new ArrayList<Potion>();
        this.equippedWeapon = new WoodenSword();

    }

    public void runInventory(){
        boolean inInventory = true;
        Scanner scan = new Scanner(System.in);
        String input = "";
        while(inInventory){
            System.out.println(inventoryMessage());
            input = scan.nextLine().toLowerCase();
        }
    }

    public boolean equipWeapon(String weaponName){
        int weaponIndex = searchForWeapon(weaponName);
        if(weaponIndex == -1){
            return false;
        }
        Weapon equip = getWeapon(weaponIndex);
        addWeapon(equippedWeapon);
        equippedWeapon = equip;

        return true;
    }


    public void addPotion(Potion p){
        potions.add(p);
    }

    public void addWeapon(Weapon w){
        weapons.add(w);
    }

    public int searchForWeapon(String weaponName){
        for(int i = 0; i < weapons.size(); i++){
            if(weapons.get(i).getName().equals(weaponName)){
                return i;
            }
        }
        return -1;
    }

    public int searchForPotion(String potionName){
        for(int i = 0; i < potions.size(); i++){
            Potion potion = potions.get(i);
            if(potion.getEffect().equals(potionName)){
                return i;
            }
        }
        return -1;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public Weapon getWeapon(int index){
        Weapon weapon = weapons.get(index);
        weapons.remove(index);
        return weapon;
    }

    public Potion getPotion(int index){
        Potion potion = potions.get(index);
        potions.remove(index);
        return potion;
    }

    private String inventoryMessage(){
        String result = "";
        result += "This is your inventory, please type one of the following commands\n";
        result += "\"exit\" to exit your inventory\n";
        result += "\"equip [Weapon name]\" to equip a weapon\n";
        result += "\"drink [Potion name]\" to drink a potion\n";

        return result;
    }

    @Override
    public String toString() {
        String result = "";
        result += "===============Money===============\n";
        if(money == 0){
            result += "You have no money!\n";
        }
        else{
            result += ("You have: " + money + " money\n");
        }

        result += "===============Weapons===============\n";
        if(weapons.size() == 0){
            result += "You have no weapons in your bag!\n";
        }
        else {
            for (int i = 0; i < weapons.size(); i++) {
                result += weapons.get(i).toString();
                result += "\n";
            }
        }
        result += "===============Potions===============\n";
        if (potions.size() == 0){
            result += "You have no potions in your bag!\n";
        }
        else{
            for (int i = 0; i < potions.size(); i++) {
                result += potions.get(i).toString();
                result += "\n";
            }
        }

        return result;
    }
}
