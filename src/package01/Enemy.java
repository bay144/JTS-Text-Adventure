package package01;
import java.util.Random;


// @me try without extends? bc if i dont add it its not runnable
public class Enemy extends Game {
    int health, attack, defense, speed, luck;
    String name;

    Enemy() {
        this("N/A", 1, 1, 1, 1, 1);
    }

    Enemy(String n, int h, int a, int d, int s, int l) {
        setName(n);
        setHealth(h);
        setAttackMax(a);
        setDefense(d);
        setSpeed(s);
        setLuck(l);
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int h) {
        health = h;
    }

    public int getHealth() {
        return health;
    }

    public void setAttackMax(int a) {
        attack = a;
    }

    public int getAttackMax() {

        return attack;
    }

    public void setDefense(int d) {
        defense = d;
    }

    public int getDefense() {
        return defense;
    }

    public void setSpeed(int s) {
        speed = s;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLuck(int l) {
        luck = l;
    }

    public int getLuck() {
        return luck;
    }

    public int CalculateAttack() {
        Random rand = new Random();
        int randomNum = rand.nextInt((attack - 1) + 1) + 1;
        return randomNum;
    }

    public Boolean CalculateMiss() {
        Random rand = new Random();
        int missVal = rand.nextInt((100 - 1) + 1) + 1;
        return missVal >= luck;
    }

    public void attackOther(Enemy victim) {
        int difference = CalculateAttack() - victim.getDefense();
        printAttack();
        if (CalculateMiss() && difference > 0) {
            victim.setHealth(victim.getHealth() - difference);
        }
    }

    public void printAttack() {
        System.out.printf("%n Attack : %d %n Hit : %b %n", CalculateAttack(), CalculateMiss());
    }

    public void printAllStats() {
        System.out.println(" ");
        System.out.printf("Name: %s %n Health: %d %n Attack Max: %d %n Defense: %d %n Speed: %d %n Luck: %d %n",
                name, health, attack, defense, speed, luck);
    }

    public void equip(Item equipmentItem) {
        if (equipmentItem.getEquipStatus() == false) {
            setHealth(getHealth() + equipmentItem.getHealth());
            setAttackMax((getAttackMax() + equipmentItem.getAttackMax()));
            setDefense(getDefense() + equipmentItem.getDefense());
            setSpeed(getSpeed() + equipmentItem.getSpeed());
            setLuck(getLuck() + equipmentItem.getLuck());
            equipmentItem.setEquipStatus(true);
        }
    }

    public void dequip(Item equipmentItem) {
        if (equipmentItem.getEquipStatus()) {
            setHealth(getHealth() - equipmentItem.getHealth());
            setAttackMax((getAttackMax() - equipmentItem.getAttackMax()));;
            setDefense(getDefense() - equipmentItem.getDefense());
            setSpeed(getSpeed() - equipmentItem.getSpeed());
            setLuck(getLuck() - equipmentItem.getLuck());
            equipmentItem.setEquipStatus(false);
        }
    }
}

