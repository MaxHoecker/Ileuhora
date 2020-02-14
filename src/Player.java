public class Player {
    private int maxHealth;
    private int currentHealth;
    private int defeatedEnemies;
    private boolean blocking;
    private Inventory inventory;

    public Player() {
        this.maxHealth = 100;
        this.currentHealth = maxHealth;
        this.defeatedEnemies = 0;
        this.blocking = false;
        this.inventory = new Inventory();
    }

    public void printInventory(){
        System.out.println(inventory.toString());
    }
}
