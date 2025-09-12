/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage {
    {
        public static void main (String[]args)
        {


            // declare variables
            int numRuns;
            double num1, num2, num3, sum, avg, prod;
            Scanner scan = new Scanner(System.in);

            // prompt user for number of runs, then loop program that many times
            System.out.print("Input number of runs:  ");
            numRuns = scan.nextInt();

            for (int j = 0; j < numRuns; j++) {
                // read in user inputs
                System.out.print("\nInput three numbers:  ");
                num1 = scan.nextDouble();
                num2 = scan.nextDouble();
                num3 = scan.nextDouble();

                // calculate the sum, average, and product, then output the results
                sum = num1 + num2 + num3;
                avg = sum / 3;
                prod = num1 * num2 * num3;

                System.out.println(sum);
                System.out.println(avg);
                System.out.println(prod);
            }
        }
    }
}