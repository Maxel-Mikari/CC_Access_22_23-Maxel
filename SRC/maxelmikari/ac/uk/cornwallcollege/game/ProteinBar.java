package maxelmikari.ac.uk.cornwallcollege.game;

public class ProteinBar extends Item {
    public ProteinBar(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.health += 2;
    }
}
