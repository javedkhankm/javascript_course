import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {

		//SimpleDateFormat is a concrete class for formatting and parsing date which inherits
		//java.text.Dateformat class.
		//formatting means converting date to string and parsing means converting string to date.
		
		Date date = new Date();
		
		System.out.println(date);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //M = month, m = minute
		String strDate = formatter.format(date); //formate(date) is a method of SimpleDateFormat class.
		//and we are accessing or using it through Object formatter.
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("MM/dd/yyyy");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("E,dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		formatter = new SimpleDateFormat("EEEE,dd MMM yyyy HH:mm:ss z");
		strDate = formatter.format(date); 
		System.out.println(strDate);
		
		//Convert string into Date
		
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		date = formatter.parse("31/03/2015");
		System.out.println(date);
		
		
		
		
		
	}

}
