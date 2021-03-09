package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int user_input = scanner.nextInt();

        if (user_input % 5 == 0 && user_input %3 == 0)
            System.out.println("Fizzbuzz");
        else if (user_input % 5 == 0)
            System.out.println("Fizz");
        else if (user_input % 3 == 0)
            System.out.println("buzz");
        else
            System.out.println(user_input);

    }
}
