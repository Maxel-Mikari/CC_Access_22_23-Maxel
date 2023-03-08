package maxelmikari.ac.uk.cornwallcollege.game;

public class Stick extends Item {
    public Stick(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.attack += 1;
    }
}
