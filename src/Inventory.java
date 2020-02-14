import Potions.Potion;
import Weapons.Weapon;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Weapon> weapons;
    private ArrayList<Potion> potions;
    private int money;

    public Inventory() {
        money = 0;
        weapons = new ArrayList<Weapon>();
        potions = new ArrayList<Potion>();
    }

    public void addPotion(Potion p){
        potions.add(p);
    }

    public void addWeapon(Weapon w){
        weapons.add(w);
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

    @Override
    public String toString() {
        String result = "";
        result += "===============Money===============\n";
        result += (money+"\n");
        result += "===============Weapons===============\n";
        for (int i = 0; i < weapons.size(); i++) {
            result += weapons.get(i).toString();
            result += "\n";
        }
        result += "===============Potions===============\n";
        for (int i = 0; i < potions.size(); i++) {
            result += potions.get(i).toString();
            result += "\n";
        }
        return result;
    }
}