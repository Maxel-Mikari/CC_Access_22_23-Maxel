package maxelmikari.ac.uk.cornwallcollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator;
        int denominator;

        do {
            try{
                numerator = scanner.nextInt();
                denominator = scanner.nextInt();
                int result = numerator / denominator;
                System.out.println("" + numerator + " / " + denominator + " = " + result);
            } catch (ArithmeticException ex1) {
                System.out.println ("You tried to divide by zero");
            } catch (InputMismatchException ex2) {
                System.out.println("Bad input");
                scanner.nextLine();
            }

        } while (denominator != -1);
    }
}
