
package com.khaled.learning.academy.repetitionStatements;

/**
 *
 * @author Khaled
 * @website khaledlearningacademy.com
 * @program print numbers from 1 to 10 using while loop
 */
public class WhileCounter {
    
    //main method
    public static void main(String[] args) {
        
        int counter = 1; //initialize control variable with 1
        
        while ( counter <= 10 ){ // Boolean expression
            System.out.println(counter);
            ++counter; // increment control variable by 1
        }
    }
}
