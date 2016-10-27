package environmental_testing_field;
/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number of Elements :");
	int number_of_elements =  sc.nextInt() ;
	
    int array_contains_elements [] = new int[number_of_elements];
        
   
    System.out.println("Enter the Elements :");
    sc.nextLine();
    String string_of_array = sc.nextLine();
    System.out.println(string_of_array);
    String array_of_string [] = string_of_array.split(" ");
    
    int sum = 0;
    for(int i=0; i<number_of_elements; i++){
    	array_contains_elements[i]= Integer.parseInt(array_of_string [i]);
    	sum = sum+ array_contains_elements[i];
    }  
    
    System.out.println(string_of_array +" \nSum = :"+sum);
    
   }
   
       
}
