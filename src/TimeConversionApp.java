import java.util.Scanner;

public class TimeConversionApp {
    static String timeConversion(String s) {
    	String formattedTime = "";
    	String amPM = s.substring(8, 10);
    	String minSecStr = s.substring(3,8);
    	String hourStr = s.substring(0,2);
    	int hour = Integer.parseInt(hourStr);
    			
//    	System.out.println(amPM);
    	
    	if(amPM.equalsIgnoreCase("PM")) {
    		if(hour == 12) {
    			hour = 0;	
    		}	
			hour +=12;
			hourStr = String.valueOf(hour);
			formattedTime = hour+":"+minSecStr;	
    	}
    	else if (hour == 12) {
    		hour -=12;
			hourStr = String.valueOf(hour);
			formattedTime = "0"+hour+":"+minSecStr;
    	}
    	else {
    		formattedTime = s.substring(0,8);  		
    	}  	    	
    	return formattedTime;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    	String choice = "y";
    	while(choice.equalsIgnoreCase("y")) {
    	System.out.print("Enter a time (12-hr clock format 'xx:xx:xxAM'(or PM): ");
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        System.out.print("Continue?(y/n): ");
        choice = in.next();
    	}
    	System.out.println("Bye");
        in.close();      
    }
}

//Parse string to int
//String number = "10";
//int result = Integer.parseInt(number);
//System.out.println(result);

//Parse int to string
//String numberAsString = String.valueOf(-782);