package maxelmikari.ac.uk.cornwallcollege;

import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;

        do {
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println("" + numerator + " / " + denominator + " = " + result);
        } while (denominator != -1);
    }
}
