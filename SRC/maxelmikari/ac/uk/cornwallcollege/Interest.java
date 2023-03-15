package maxelmikari.ac.uk.cornwallcollege;

import java.util.Arrays;

/**
 * A program to calculate compoud interest over a number of years
 */
public class Interest {

    /**
     * Main method of program
     * @param args an array of String arguments containing the command line arguments
     */
    public static void main(String[] args){
    double starting = 1000;
    int rate = 15;

    double[] balance = new double[11];  // sets up an array of 11 items

        balance[0] = starting;
        //  loop through all the years
        for(int year = 1; year <=10; ++year) { //  starting cond; !(end cond); increment

            double interest = balance[year-1] * rate/100;
            balance[year] = balance[year-1] +interest;
        }
        System.out.println(Arrays.toString(balance));
        //now using formula
        double oneyears = starting * (1.0 + rate/100.0) * (1.0 + rate/100.0);
        System.out.println(oneyears);
        double twoyears = starting * (1.0 + rate/100.0) * (1.0 + rate/100.0);
        System.out.println(twoyears);
        double tenyears = starting * Math.pow(1.0 + rate/100.0, 10);
        System.out.printf("%2f%n", tenyears);
        System.out.printf("%2f%n", balance[10]);



    }
}
