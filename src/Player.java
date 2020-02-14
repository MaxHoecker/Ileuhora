import Potions.Potion;
import Weapons.Weapon;
import Weapons.WoodenSword;

public class Player {
    private int maxHealth;
    private int currentHealth;
    private int defeatedEnemies;
    private boolean blocking;

    private Weapon equippedWeapon;
    private Inventory inventory;

    public Player() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.defeatedEnemies = 0;
        this.blocking = false;
        this.inventory = new Inventory();
        this.equippedWeapon = new WoodenSword();
    }

    /**
     * =====================================================================
     *                      inventory management
     * =====================================================================
     */
    public boolean equipWeapon(String weaponName){
        int weaponIndex = inventory.searchForWeapon(weaponName);
        if(weaponIndex == -1){
            return false;
        }
        Weapon equip = inventory.getWeapon(weaponIndex);
        inventory.addWeapon(equippedWeapon);
        equippedWeapon = equip;

        return true;
    }

    public boolean usePotion(String potionName, int potency){
        int potionIndex = inventory.searchForPotion(potionName, potency);
        if (potionIndex == -1) {
            return false;
        }
        Potion potion = inventory.getPotion(potionIndex);
        currentHealth += potion.getPotency();
        if(currentHealth > maxHealth){
            currentHealth = maxHealth;
        }
        return true;
    }

    public boolean addFunds(int money){
        inventory.
    }

    public boolean removeFunds(int money){

    }


    /***
    * ======================================================================
     *                     Getters and Setters
     * =====================================================================
    * */

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getDefeatedEnemies() {
        return defeatedEnemies;
    }

    public void setDefeatedEnemies(int defeatedEnemies) {
        this.defeatedEnemies = defeatedEnemies;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void printInventory(){
        System.out.println(inventory.toString());
    }

}
