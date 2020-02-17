import Potions.Potion;
import Weapons.Weapon;
import Weapons.WoodenSword;

public class Player {
    private int maxHealth;
    private int currentHealth;
    private int defeatedEnemies;
    private int phase;
    private boolean blocking;

    private Inventory inventory;

    public Player() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.defeatedEnemies = 0;
        phase = 1;
        this.blocking = false;
        this.inventory = new Inventory();
    }

    /**
     * =====================================================================
     *                      inventory management
     * =====================================================================
     */
    public void enterInventory(){
        inventory.runInventory();
    }

    public boolean usePotion(String potionName){
        int potionIndex = inventory.searchForPotion(potionName);
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

    public boolean hasPotion(String potionName){
        if(inventory.searchForPotion(potionName) == -1){
            return false;
        }
        return true;
    }

    public boolean hasWeapon(){
        return false;
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
    public Weapon getWeapon(){
        return inventory.getEquippedWeapon();
    }

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

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public void printInventory(){
        System.out.println(inventory.toString());
    }

}
