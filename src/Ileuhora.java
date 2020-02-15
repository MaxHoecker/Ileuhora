public class Ileuhora {
    public static void main(String[] args) {
        Player player = new Player();
        Shop shop = new Shop("Welcome to the curio shop, hope you find what you're looking for.");
        Overworld overworld = new Overworld();
        overworld.runOverworld(player, shop);

    }
}
