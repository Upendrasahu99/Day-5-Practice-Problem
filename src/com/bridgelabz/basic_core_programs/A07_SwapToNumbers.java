//Java Program to Swap Two Numbers

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A07_SwapToNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a = ");
        int a= sc.nextInt();
        System.out.print("Enter number b = ");
        int b= sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a = "+a+ " and " + "b = " + b);
    }

}
