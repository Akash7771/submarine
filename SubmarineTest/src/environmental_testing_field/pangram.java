package environmental_testing_field;
import java.io.*;
import java.util.*;
public class pangram {

    public static String pangramCheck(String input1)
    {
       
        int count =0;
        for(char a ='a' ; a <= 'z' ; a++){
            if( !(input1.toLowerCase().split(""+a).length >= 2) )
            {    
                return "not a pangram revisited"; 
            }
            else
            {
                count++;
            }
        }
        if(count == 12){
            return "pangram revisited";
        }    
        
        return "not a pangram revisited";
        }
        
        public static void main(String args[]){
        
        	pangram pangram1 = new pangram();
            Scanner sc = new Scanner (System.in);
            
             String pangram_string = sc.nextLine();
            System.out.println(pangram1.pangramCheck(pangram_string));
            
        
        }
}
