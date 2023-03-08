package maxelmikari.ac.uk.cornwallcollege.game;

public class RedBull extends Item{
    public RedBull(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.defence += 1;

        c.attack += 1;

        c.speed += 2;

        c.health -= 1;

        c.mood = "Buzzing";
    }
}
