//FLip Coin and print percentage of Heads and Tails.

package com.bridgelabz.basic_core_programs;

import java.util.Random;
import java.util.Scanner;

public class A01_FlipCoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Number of time to Flip Coin =");
        int numberOfTimes = s.nextInt();
        System.out.println(numberOfTimes);
        int tails = 0;//for count
        int heads = 0;//for count
        int i;
        for(i=1; i<=numberOfTimes; i++ ) {
            float number = random.nextFloat(1);
            if (number < 0.5) {
                System.out.println("Tails");
                tails++;
            } else {
                System.out.println("Heads");
                heads++;
            }

        }
        System.out.println("Number of time Tails come = " + tails );
        System.out.println("Number of time Heads come = " + heads );
        System.out.println("Percentage of tails come = " + (tails*100)/(tails+heads));
        System.out.println("Percentage of Heads come = " + (heads*100)/(tails+heads));


    }
}

