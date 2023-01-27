// Java Program to check Whether a Number is Even or Odd

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A08_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number= sc.nextInt();
        if((number%2)==0){
            System.out.println("Number " + number + " is even number ");
        }else {
            System.out.println("Number " + number + " is odd number ");
        }
    }
}
