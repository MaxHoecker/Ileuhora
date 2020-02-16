import Enemies.*;

import java.util.Random;
import java.util.Scanner;

public class Encounter {
    final static int PHASE1COUNT = 20;
    private Player player;
    private Enemy enemy;

    public Encounter(Player player) {
        this.player = player;
        this.enemy = null;
    }

    public void runEncounter(boolean enterBoss){
        makeEnemy(enterBoss);
        boolean inEncounter = true;
        Scanner scan = new Scanner(System.in);
        while (inEncounter){
            inEncounter = false;
        }
    }

    private void makeEnemy(boolean enterBoss){
        if(enterBoss){
            if(player.getPhase() == 1){
                makeBoss1();
            }
        }
        else{
            if(player.getPhase() == 1){
                makeMonster1();
            }
        }
    }

    private void makeBoss1(){
        if(player.getDefeatedEnemies() >= PHASE1COUNT){
            Enemy enemy = new Gurtrude();
        }
    }

    private Enemy makeMonster1(){
        Random rand = new Random();

        int whichEnemy = rand.nextInt(3);
        if(whichEnemy == 0){
            Enemy enemy = new Wolf();
        }
        else if(whichEnemy == 1){
            Enemy enemy = new GiantBat();
        }
        else if(whichEnemy == 2){
            Enemy enemy = new WoodNymph();

        }
        return enemy;
    }
}
