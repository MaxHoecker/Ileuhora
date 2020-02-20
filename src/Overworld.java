import java.util.ArrayList;
import java.util.Scanner;

public class Overworld {
    public void runOverworld(Player player, Shop shop){
        Scanner scan = new Scanner(System.in);
        boolean runGame = true;
        Encounter encounter = new Encounter(player);
        helpMenu();

        while(runGame){
            String input = scan.nextLine();
            switch (input){
                case "help":
                    helpMenu();
                    break;
                case "inv":
                    player.enterInventory();
                    break;
                case "shop":
                    shop.runShop(player);
                    break;
                case "attack":
                    encounter.runEncounter(false);
                    break;
            }

        }
    }

    private void helpMenu(){
        System.out.println("\"help\" - for help");
        System.out.println("\"inv\" - for inventory");
        System.out.println("\"shop\" - for the shop");
        System.out.println("\"attack\" - to encounter a random enemy");
    }
}
