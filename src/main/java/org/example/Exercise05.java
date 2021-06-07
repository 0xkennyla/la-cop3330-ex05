/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        String first = scan.next();
        System.out.println("What is the second number?");
        String second = scan.next();

        int x = Integer.parseInt(first);
        int y = Integer.parseInt(second);

        int add = x+y;
        int subtract = x-y;
        int multiply = x*y;
        int divide = x/y;

        System.out.println(x+" + "+y+" = "+add+"\n"+x+" - "+y+" = "+subtract+"\n"
                +x+" * "+y+" = "+multiply+"\n"+x+" / "+y+" = "+divide);
    }
}
