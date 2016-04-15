package com.khaled.learning.academy.someExamples;

import java.util.Scanner;

/**
 * Fibonacci Number
 * @author Khaled
 * @website khaledlearningacademy.com
 */
public class Fibonacci {
  
    static int f0=0,f1=1;
    //main method
    public static void main(String[] args) {
        int f,inputNumber;
        
        Scanner input = new Scanner( System.in );
        inputNumber=Integer.parseInt(input.nextLine());
    
        System.out.printf("\n%d",f0);
        System.out.printf("\n%d",f1);
    
        for(int i=2;i<inputNumber;i++)
        {
                f=f0+f1;
                System.out.printf("\n%d + %d = %d",f0,f1,f);
                f0=f1;
                f1=f;
        }
    }
}


