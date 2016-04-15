
package com.khaled.learning.academy.someExamples;

import java.util.Scanner;

/** 
 * @Factors of a number that is multiple by only prime numbers
 * @website khaledlearningacademy.com
 * @author Khaled
 */
public class FactorsOfaNumber {
    
     public static void main(String[] args) {
        
        //User Input using Scanner Class
        Scanner input = new Scanner( System.in );
        int inputNumber = input.nextInt();
        
        System.out.print("1 ");
        for(int i=2;i<=inputNumber;i++)
        {
            //check for the prime numbers
            while(inputNumber%i==0)
            {
                   System.out.print(" x "+i);
                   inputNumber=inputNumber/i;
            }
	}
        System.out.println();
    }
}
