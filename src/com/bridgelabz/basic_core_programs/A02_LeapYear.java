//Leap Year
/* Condition
1: (year % 100) = 0  and (year % 400) =0
2: (year % 4) =0 and (year % 100) != 0 (After every 4 year leap year come)
        */

package com.bridgelabz.basic_core_programs;


import java.util.Scanner;

public class A02_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        if (year >= 1000 && year <= 9999) {
            if ((year % 4) == 0 && (year % 100) != 0) {
                System.out.println(year + " is a leap year ");
            } else if ((year % 100) == 0 && (year % 400) == 0) {
                System.out.println(year + " is a leap year ");
            } else {
                System.out.println(year + "is not a leap year");
            }
        }else {
            System.out.println("Enter 4 digit year");
        }
    }
}