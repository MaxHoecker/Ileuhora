package Enemies;

public abstract class Enemy {
    private int maxHealth;
    private int currentHealth;

    public Enemy(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean isAlive(){
        if (currentHealth <= 0){
            return false;
        }
        return true;
    }

    public abstract int attack();

    public void takeDamage(int damage){
        currentHealth -= damage;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
}
