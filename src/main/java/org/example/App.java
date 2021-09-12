package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is the input string?" );
        String str = input.next();
        int length = str.length();


        System.out.println(str + " has " + length + " characters.");
    }
}
