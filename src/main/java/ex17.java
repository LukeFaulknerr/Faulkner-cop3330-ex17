/*
    UCF COP3330 Fall 2021 Assignment 17 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/* Note -   I made this program using the provided formula. However, it does not provide the
            coinciding example. I could not find a way to fix the formula in order for it to remain
            similar and provide the correct result.
 */
public class ex17 {
    public static void main(String[] args) {

        try {
            // Variables
            int s, a, w, h;
            double r;
            Scanner policeOfficer = new Scanner(System.in);

            // Prompt
            System.out.print("Enter a 1 if you are a male or a 2 if you are a female: ");
            s = policeOfficer.nextInt();

            System.out.print("How many ounces of alcohol did you have? ");
            a = policeOfficer.nextInt();

            System.out.print("What is your weight, in pounds? ");
            w = policeOfficer.nextInt();

            System.out.print("How many hours has it been since your last drink? ");
            h = policeOfficer.nextInt();

            // Calc
            r = (s == 1) ? 0.73 : 0.66;
            double BAC = (a * 5.14 / w * r) - (0.15 * h);

            // Output
            String output = BAC > 0.08 ? "It is not legal for you to drive." : "It is is legal for you to drive.";
            System.out.println("Your BAC is " + BAC);
            System.out.print(output);
        }
        catch (InputMismatchException x){
            System.out.print("That is not a number.");
        }
    }
}
