
package com.khaled.learning.academy.oop;

/**
 *
 * @author Khaled
 * @website khaledlearningacademy.com
 * @Create Object, set and print customer information
 */
public class CustomerInfo {
    
     public static void main(String[] args) {
        //create First Customer  object
        Customer customer1 = new Customer();

        //Set values for First Customer
        customer1.setCustomerID(110);
        customer1.setFirstName("John");
        customer1.setLastName("Smith");
        customer1.setAddress("New York");
        customer1.setPhoneNumber(123456789);

         //create Second Customer  object
        Customer customer2 = new Customer();

        //Set values for Second Customer
        customer2.setCustomerID(111);
        customer2.setFirstName("Khaled");
        customer2.setLastName("Hossain");
        customer2.setAddress("Bangladesh");
        customer2.setPhoneNumber(987654321);
        
        //Print customers information
        System.out.println("First Customer Information"); 
        
        System.out.println("Customer ID: " + customer1.getCustomerID() + 
                           ", Customer Name: " + customer1.getFirstName() + " " + customer1.getLastName() +
                           ", Address: "+ customer1.getAddress() + ", Phone Number: " + customer1.getPhoneNumber()
                     );
       
        System.out.println("Second Customer Information");
     
        System.out.println("Customer ID: " + customer2.getCustomerID() + 
                           ", Customer Name: " + customer2.getFirstName() + " " + customer2.getLastName() +
                           ", Address: "+ customer2.getAddress() + ", Phone Number: " + customer2.getPhoneNumber()
                     );
        
    }   
    
}
