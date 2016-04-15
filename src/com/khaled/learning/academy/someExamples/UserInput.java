/**
 * @author Khaled
 * @website khaledlearningacademy.com
 */
package com.khaled.learning.academy.someExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Khaled
 * @website khaledlearningacademy.com
 */
public class UserInput {
    //main method
    public static void main(String[] args) {
        
        //User Input using Scanner Class
        Scanner input = new Scanner( System.in );
        System.out.println(input.nextLine());
        
        //User Input using BufferedReader and InputStreamReader Class
        try{
            BufferedReader inputLine = new BufferedReader( new InputStreamReader(System.in) );
            System.out.println(inputLine.readLine());
        }catch(IOException err){
            System.out.println(err);
        }
    } 
}
