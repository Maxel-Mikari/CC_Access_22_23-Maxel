package maxelmikari.ac.uk.cornwallcollege.game;

public class BigStick extends Item{
    public BigStick(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.attack += 2;

        c.speed -= 1;
    }
}
