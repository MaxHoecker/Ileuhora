import Potions.Potion;
import Weapons.Weapon;
import Weapons.WoodenSword;

public class Player {
    private int maxHealth;
    private int currentHealth;
    private int defeatedEnemies;
    private int phase;
    private boolean blocking;

    private Weapon equippedWeapon;
    private Inventory inventory;

    public Player() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.defeatedEnemies = 0;
        phase = 1;
        this.blocking = false;
        this.inventory = new Inventory();
        this.equippedWeapon = new WoodenSword();
    }

    /**
     * =====================================================================
     *                      combat management
     * =====================================================================
     */
    public int attack(String attackName){
        return 0;
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
        int monney = inventory.getMoney();
        inventory.setMoney(monney + money);
        return true;
    }

    public boolean removeFunds(int money){
        int monney = inventory.getMoney();
        if(monney - money < 0){
            return false;
        }
        inventory.setMoney(monney - money);
        return true;
    }

    public boolean addPotion(Potion potion){
        inventory.addPotion(potion);
        return true;
    }

    public boolean addWeapon(Weapon weapon){
        inventory.addWeapon(weapon);
        return false;
    }


    /***
    * ======================================================================
     *                     Getters and Setters
     * =====================================================================
    * */
    public int getMoney(){
        return inventory.getMoney();
    }

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


    public void printInventory(){
        System.out.println(inventory.toString());
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }
}
