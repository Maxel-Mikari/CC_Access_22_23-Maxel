package maxelmikari.ac.uk.cornwallcollege.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void testCharacterCreation() {
        Character c1 = new Character( 50, 15, 20, 5, 1, "ZORRO");

    }

    @Test
    public void testHitting() {
        Character c1 = new Character( 50, 15, 20, 5, 1, "ZORRO");

        Character c2 = new Character( 50, 15, 0, 5, 1, "Sheep");

        c1.hit(c2);
        assertEquals(35, c2.health);
        System.out.println("Test successfully passed! Health is "+c2.health);
    }

    @Test
    public void testPlayableCharacterCreation() {
        PlayableCharacter c1 = new PlayableCharacter( 50, 15, 20, 5, 1, "Maxel Mikari");
        assertEquals( 0,c1.experience);
    }
}
