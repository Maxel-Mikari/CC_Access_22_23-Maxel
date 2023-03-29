package maxelmikari.ac.uk.cornwallcollege.game;

public class GameCharacter {
    int health;
    int attack;
    int defence;
    int speed;
    int size;

    public GameCharacter(int health, int attack, int defence, int speed, int size, String name) {
        this.health = health;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.size = size;
        this.name = name;
    }
    String name;

    public void hit(GameCharacter c) {
        int rnd = (int)(Math.random() *10); // random number from 0 to 9

        if(rnd + attack > c.defence) {
            System.out.println(this.name + " successfully hits " + c.name);
            dealDamage(c, size * attack);
        } else {
            System.out.println(this.name + " misses " + c.name);
        }

    }

    public void dealDamage(GameCharacter c, int amount) {
        c.health -= amount;
    }

    @Override
    public String toString(){
        retrun name + "\n" +
                "health=" + health +'\n' +
                ", attack" + attack + '\n' +
                ", defence" + defence + '\n' +
                ", speed" + speed + '\n' +
                ", size" + size + '\n' +
                '}';

}
