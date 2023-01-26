//Java Program to Check Whether an Alphabet is Vowel or Consonant

package com.bridgelabz.basic_core_programs;

import java.util.Scanner;

public class A9_CheckAnAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Alphabet : ");
        char c= sc.next().charAt(0); //doubt how to use
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Alphabet is a vowel.");

        }else{
            System.out.println("Alphabet is a consonant.");
        }

    }
}
