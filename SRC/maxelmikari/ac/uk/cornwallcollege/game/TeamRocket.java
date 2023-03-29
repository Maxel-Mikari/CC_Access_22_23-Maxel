package maxelmikari.ac.uk.cornwallcollege.game;

public class TeamRocket extends NPC{

    public TeamRocket(int health, int attack, int defence, int speed, int size, String name) {
        super(health, attack, defence, speed, size, name);
    }

    @Override
    public String toString() {
        return "Prepare for trouble and make it double! To protect the world from devastation, to unite all peoples within our nation. To denounce the evils of truth and love, to extend our reach to the stars above. Jessie! James! Team Rocket blasts off at the speed of light. Surrender now or prepare to fight! Meowth! That's right!";
    }

    @Override
    public void dealDamage(GameCharacter c, int amount) {
        c.health -= attack;

        c.health -= attack;


    }
}
