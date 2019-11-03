package sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class samll {

	public static void main(String[] args) {
			//"E MM dd HH:mm:ss z YYYY"  
		
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		String strDate= formatter.format(date);  
	    System.out.println(strDate);
	    
	    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");  
	    try {  
	        Date date2 = formatter2.parse("31/03/2015");  
	        System.out.println("Date is: "+date2);  
	    } catch (ParseException e) {e.printStackTrace();}  
	}  
	    
	

}
