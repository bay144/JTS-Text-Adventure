package package01;

public class CreateEnemy  {
    public static void main(String[] args) {
        // Luck must be between 1 and 100, higher luck = higher chance to hit
        Enemy goblin = new Enemy("Goblin", 10, 10, 5, 15, 50);
        Enemy player = new Enemy("Hero", 50, 10, 5, 15, 50);
        Item helm = new Item("Helmet of Plus Ten", 10, 10, 10, 10, 10, false);

        goblin.printAllStats();
        player.printAllStats();
        goblin.attackOther(player);
        player.printAllStats();

        goblin.printAllStats();
        goblin.equip(helm);
        goblin.printAllStats();
        goblin.dequip(helm);
        goblin.printAllStats();

    }
}
