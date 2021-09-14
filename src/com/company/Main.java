/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Makiya Thomas
 */
package com.company;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int fn = input.nextInt();

        System.out.print("Enter the second number: ");
        int sn = input.nextInt();

        System.out.print("Enter the third number: ");
        int tn = input.nextInt();

        if (fn > sn && fn > tn) {
            System.out.printf("The largest number is %d", fn);
        } else if (sn > fn && sn > tn) {
            System.out.printf("The largest number is %d", sn);
        } else {
            System.out.printf("The largest number is %d", tn);
        }
    }
}