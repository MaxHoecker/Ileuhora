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
        System.out.println("Your opponent is: " + enemy.toString());
        boolean inEncounter = true;
        Scanner scan = new Scanner(System.in);
        while (inEncounter){
            String command = scan.nextLine();

            switch (command){
                case "attack":
                    System.out.println("ya hit it");
                    enemy.takeDamage(player.attack());
                    break;
                case "run":
                    inEncounter = false;
                    break;
            }
            System.out.println("u got hit");
            player.setMaxHealth(player.getCurrentHealth() - enemy.attack());

            if(player.getCurrentHealth() < 0 || enemy.getCurrentHealth() < 0){
                inEncounter = false;
                System.out.println("someone dead");
            }
        }
    }

    private void makeEnemy(boolean enterBoss){
        if(enterBoss){
            if(player.getPhase() == 1){
                enemy = makeBoss1();
            }
        }
        else{
            if(player.getPhase() == 1){
                enemy = makeMonster1();
            }
        }
    }

    private Enemy makeBoss1(){
        if(player.getDefeatedEnemies() >= PHASE1COUNT){
            Enemy enemy = new Gurtrude(500, 3);
        }
        return enemy;
    }

    private Enemy makeMonster1(){
        Random rand = new Random();

        int whichEnemy = rand.nextInt(3);
        if(whichEnemy == 0){
            Enemy enemy = new Wolf();
            return enemy;
        }
        else if(whichEnemy == 1){
            Enemy enemy = new GiantBat();
            return enemy;
        }
        else if(whichEnemy == 2){
            Enemy enemy = new WoodNymph();
            return enemy;
        }
        System.err.println("NOOOOOOOOOOOOOOO");
        return enemy;
    }
}
