//Name: Sidney Seay
//CSc 2010, Principle of Computer Science
//Fall 2013
//Assignment 6; Time Program
//Submitted: 10-31-13
import java.util.Scanner;

public class Time {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		//Enters earlier time and later time. Also enters the number of minutes between. 
		//Then, it calculates the difference between.
		
		System.out.println("Enter Earlier Time: ");
		String earlyTime = sc.next();
		
		System.out.println("Enter Later Time: ");
		String laterTime = sc.next();
		
		String apstr = "1P012:2P012:3P012:4P012:5P012:6P012:7P012:8P012:9P012:10P012:11P012:12P000:"+
	               "1A000:2A000:3A000:4A000:5A000:6A000:7A000:8A000:9A000:10A000:11A000:12A-12";
		
		int colon = earlyTime.indexOf(":");
		earlyTime.indexOf(colon +3);
		int earlyHour = Integer.parseInt(earlyTime.substring(0, colon));
		int earlyMinutes = Integer.parseInt(earlyTime.substring(earlyTime.length() - 4, earlyTime.length() - 2));
		String earlyAP = earlyTime.substring(earlyTime.length() - 2, earlyTime.length() - 1);
		
		colon = laterTime.indexOf(":");
		laterTime.indexOf(colon +3);
		int laterHour = Integer.parseInt(laterTime.substring(0, colon));
		int laterMinutes = Integer.parseInt(laterTime.substring(laterTime.length() - 4, laterTime.length() - 2));
		String laterAP = laterTime.substring(laterTime.length() - 2, laterTime.length() - 1);
		
		String earlyHourAP = earlyHour + earlyAP;
		
		apstr.indexOf(":");
		int earlyAPSearch = apstr.indexOf(earlyHourAP.toUpperCase());
		String earlyAddHour = apstr.substring(earlyAPSearch + earlyHourAP.length(), earlyAPSearch + earlyHourAP.length()+3);
		
		String laterHourAP = laterHour + laterAP;
		apstr.indexOf(":");
		int laterAPSearch = apstr.indexOf(laterHourAP.toUpperCase());
		String laterAddHour = apstr.substring(laterAPSearch + laterHourAP.length(), laterAPSearch + laterHourAP.length()+3);
		
		int earlyAddHour1 = Integer.parseInt(earlyAddHour);
		int laterAddHour1 = Integer.parseInt(laterAddHour);
		
		int newEarlyHour = earlyHour + earlyAddHour1;
		int newLaterHour = laterHour + laterAddHour1;
		
		int newEarlyMinutes = ((newEarlyHour * 60) + earlyMinutes);
		int newLaterMinutes = ((newLaterHour * 60) + laterMinutes);
		
		int minutesBetween = newLaterMinutes - newEarlyMinutes;
		int newHours = minutesBetween / 60;
		int newMinutes = minutesBetween % 60;
		
		
		System.out.println("Number of minutes between " +earlyTime +" and " +laterTime +" = " +minutesBetween);
		System.out.println("The time difference between " +earlyTime +" and " +laterTime +" = " +newHours +" hours and " +newMinutes +" minutes.");
		
		sc.close();
				
	}
}