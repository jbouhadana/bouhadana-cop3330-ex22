/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int numb1 = jb.nextInt();
        System.out.println("Please enter the second number: ");
        int numb2 = jb.nextInt();
        System.out.println("Please enter the third number: ");
        int numb3 = jb.nextInt();
        int max = Math.max(Math.max(numb1,numb2),numb3);

        System.out.println("The largest number is " + max);

    }
}