package maxelmikari.ac.uk.cornwallcollege.game;

public class TeamRocket extends NPC{

    public TeamRocket(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    @Override
    public void dealDamage(Character c, int amount) {
        c.health -= attack;

        c.health -= attack;


    }
}
