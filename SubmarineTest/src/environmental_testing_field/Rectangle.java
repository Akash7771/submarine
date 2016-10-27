package environmental_testing_field;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args) {
	
String n = "The quitck  tbrown fox jumps over the lazy dog";

System.out.println(
		n.toLowerCase().indexOf("t")
		+"Occurence " +
		(n.toLowerCase().split("t").length -1)
		);
}
}
