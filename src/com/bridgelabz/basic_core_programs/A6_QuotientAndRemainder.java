//Java Program to Compute Quotient and Remainder

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A6_QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter number for Divisor : ");
        int divisor=sc.nextInt();
        System.out.println(dividend+"/"+divisor + " than Quotient is " +dividend/divisor + " and Remainder is " + dividend%divisor);
    }

}
