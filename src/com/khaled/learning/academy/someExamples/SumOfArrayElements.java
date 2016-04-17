
package com.khaled.learning.academy.someExamples;

/** 
 * @Sum of Array Elements
 * @website khaledlearningacademy.com
 * @author Khaled
 */
public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {50,100,150,120,130};
        int sum=0;
        for(int element:array){
            sum=sum+element;
        }
        System.out.println("Summation of Array elements is "+sum);
    }
}
