package maxelmikari.ac.uk.cornwallcollege.game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        /* GameCharacter c1 = new GameCharacter(10, 5, 4, 1, 2, "Zorro");
        System.out.println(c1.toString());
        GameCharacter c2 = new PlayableCharacter(5, 6, 7, 8, 9, "Safdari");
        System.out.println(c2);
        GameCharacter c3 = new NPC(1,2, 3, 4, 5, "Joe Hill");
        System.out.println(c3);
        GameCharacter c4 = new TeamRocket(1, 2,3,4,5,"Rockets");
        System.out.println(c4);
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please select first character\n1 for a playable character\n2 for an NPC\n3 for Team Rocket");
        int choice = scan.nextInt();
        GameCharacter c1;
        switch (choice) {
            case 1:
                c1 = new PlayableCharacter(5, 6, 7, 8, 9, "Safdari");
                break;
            case 2:
                c1 = new NPC(1, 2, 3, 4, 5, "Joe Hill");
                break;
            case 3:
                c1 = new TeamRocket(1, 2, 3, 4, 5, "Rockets");
                break;
            default:
                c1 = new NPC(1, 2, 3, 4, 5, "Joe Hill");
        }
        System.out.println("The first character is "+c1);
    }
}
