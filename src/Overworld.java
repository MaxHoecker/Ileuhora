import java.util.ArrayList;
import java.util.Scanner;

public class Overworld {
    public void runOverworld(Player player, Shop shop){
        Scanner scan = new Scanner(System.in);
        boolean runGame = true;
        helpMenu();

        while(runGame){
            String input = scan.nextLine();
            switch (input){
                case "h":
                    helpMenu();
                    break;
                case "inv":
                    player.printInventory();
                    break;
                case "shop":
                    shop.runShop(player);
                    break;
                case "attack":
                    break;
            }

        }
    }

    private void helpMenu(){
        System.out.println("h - for help");
        System.out.println("inv - for inventory");
        System.out.println("shop - for the shop");
        System.out.println("attack - to encounter a random enemy");
    }
}
