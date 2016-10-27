package environmental_testing_field;

import java.util.Arrays;
import java.util.List;

 interface mi{
	
	 default void add(){
		 System.out.println("\nThis is from Interface");
		 
	 } 
 }
 
public class DosPrueba implements mi{
	
	public static void main(String[] args) {
		
		List<Integer> list =   Arrays.asList(1,2,3,4);
		
		list.forEach(i -> System.out.print(i+" "));
		DosPrueba d = new DosPrueba();
		
	}
}
