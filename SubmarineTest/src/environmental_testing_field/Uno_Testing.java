package environmental_testing_field;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Uno_Testing {

	public static void main(String[] args) {
		
		Date date = new Date("08/21/1989");
		
		try{
		SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
		
		String d = formatDate.format(date);
		
		System.out.println(d);
			
			/*String string = "January 2, 2010";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
			LocalDate date = LocalDate.parse(string, formatter);
			System.out.println(date);*/
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
}
