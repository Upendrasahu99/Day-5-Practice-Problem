//FLip Coin and print percentage of Heads and Tails.

package com.bridgelabz.basic_core_programs;

import java.util.Random;
import java.util.Scanner;

public class A1_FlipCoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Number of time to Flip Coin =");
        int numberOfTimes = s.nextInt();
        System.out.println(numberOfTimes);
        int i;
        for(i=1; i<=numberOfTimes; i++ ) {
            float number = random.nextFloat(1);
            if (number < 0.5) {
                System.out.println("Tails");
            } else {
                System.out.println("Heads");
            }

        }


    }
}

