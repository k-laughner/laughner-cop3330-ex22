/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        Scanner input = new Scanner(System.in);
        int no1 = input.nextInt();

        System.out.println("Enter the second number:");
        Scanner input2 = new Scanner(System.in);
        int no2 = input2.nextInt();

        System.out.println("Enter the third number:");
        Scanner input3 = new Scanner(System.in);
        int no3 = input3.nextInt();


        if (no1 == no2 || no1 == no3 || no2 == no3)
        {
            System.out.println("You cannot enter the same numbers.");
        }
        else if (no1>no2) {
            if (no1>no3)
            {
                System.out.printf("The first number, %d, is the largest.", no1);
            }
            else {
                System.out.printf("The third number, %d, is the largest.", no3);
            }
        }
        else if (no2>no1) {
            if (no2>no3){
                System.out.printf("The second number, %d, is the largest.", no2);
            }
            else {
                System.out.printf("The third number, %d, is the largest.", no3);
            }
        }
    }
}