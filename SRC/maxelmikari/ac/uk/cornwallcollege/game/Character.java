package maxelmikari.ac.uk.cornwallcollege.game;

public class Character {
    int health;
    int attack;
    int defence;
    int speed;
    int size;

    public Character(int health, int attack, int defence, int speed, int size, String name) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.size = size;
        this.name = name;
    }
    String name;

    public void hit(Character c) {
        int rnd = (int)(Math.random() *10); // random number from 0 to 9

        if(rnd + attack > c.defence) {
            System.out.println(this.name + " successfully hits " + c.name);
            dealDamage(c, size * attack);
        } else {
            System.out.println(this.name + " misses " + c.name);
        }

    }

    public void dealDamage(Character c, int amount) {
        c.health -= amount;
    }

}
