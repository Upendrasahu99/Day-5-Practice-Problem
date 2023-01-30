//Java Program to Check Whether an Alphabet is Vowel or Consonant

package com.bridgelabz.basic_core_programs;


public class A09_CheckAnAlphabet {
    public static void main(String[] args) {

        System.out.print("Enter Alphabet : ");
        char c= 'd';
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("Alphabet is a vowel.");

        }else{
            System.out.println("Alphabet is a consonant.");
        }

    }
}
