import Enemies.Enemy;
import Enemies.GiantBat;
import Enemies.Gurtrude;
import Enemies.Wolf;

import java.util.Random;

public class Encounter {
    final static int PHASE1COUNT = 20;
    private Player player;
    private Enemy enemy;

    public Encounter(Player player) {
        this.player = player;
        this.enemy = null;
    }

    public void runEncounter(){

    }

    public void initializeEnemyPhase1(){

    }

    public Enemy makeEnemy1(){
        Random rand = new Random();
        if(player.getDefeatedEnemies() >= PHASE1COUNT){
            Enemy enemy = new Gurtrude();
        }
        else{
            int whichEnemy = rand.nextInt(3);
            if(whichEnemy == 0){
                Enemy enemy = new Wolf();
            }
            else if(whichEnemy == 1){
                Enemy enemy = new GiantBat();
            }
            else if(whichEnemy == 2){

            }
        }
        return enemy;
    }
}
