//Java Program to FInd the Largest Among Three Numbers

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A10_LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        double n1 = sc.nextDouble();
        System.out.print("Enter second number = ");
        double n2 = sc.nextDouble();
        System.out.print("Enter third number = ");
        double n3 = sc.nextDouble();
        if(n1>n2&&n1>n3){
            System.out.println(n1 + " Is the largest number ");

        } else if (n2>n1&&n2>n3) {
            System.out.println(n2 + "Is the largest number ");

        }else{
            System.out.println(n3 + "Is the largest number ");
        }
    }
}
