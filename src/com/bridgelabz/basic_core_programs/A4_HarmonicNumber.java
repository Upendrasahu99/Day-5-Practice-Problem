//Harmonic Number

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A4_HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N =");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("1/"+ i + " + " );
        }
    }
}