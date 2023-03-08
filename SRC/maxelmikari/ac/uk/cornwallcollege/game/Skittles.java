package maxelmikari.ac.uk.cornwallcollege.game;

public class Skittles extends Item {
    public Skittles(String name) {
        super(name);
    }

    @Override
    public void apply(PlayableCharacter c) {
        c.speed += 1;

        c.mood = "Hyperactive";
    }
}
