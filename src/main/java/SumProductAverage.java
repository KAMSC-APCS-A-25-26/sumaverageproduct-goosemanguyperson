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

public class SumProductAverage
{
    public static void main(String[] args)
    {
        // declare variables and scanner
        int numRuns;
        double num1, num2 num3, sum, prod, avg;
        Scanner sc = new Scanner(System.in);

        // prompt for number of runs and loop
        System.out.println("Input number of runs:  ");
        numRuns = sc.nextInt();
        for(int j=0; j<numRuns; j++)
        {
            // read in inputs
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            // calculate results
            sum = num1 + num2 + num3;
            prod = num1 * num2 * num3;
            avg = sum/3;

            System.out.println("Sum: " + sum);
            System.out.println("Product: " + prod);
            System.out.println("Average: " + avg);
        }
    }
}
