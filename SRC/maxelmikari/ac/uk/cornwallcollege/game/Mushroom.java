package maxelmikari.ac.uk.cornwallcollege.game;

public class Mushroom extends Item {
    public Mushroom(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.size += 2;

        c.health += 1;
    }
}
