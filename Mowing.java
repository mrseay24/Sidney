////////////////////////////////////////////////
/// Name: Sidney Seay                        ///
/// CSc 2010, Principles of Computer Science ///
/// Fall 2013                                ///
/// Assignment 3; Lawn Mowing Time Program   ///
/// Submitted: 10/1/2013                     ///
////////////////////////////////////////////////
import java.util.Scanner;
import java.lang.Math;


public class Mowing {
	public static void main(String [] args){
		int yardArea;
		int yardLength;
		int yardWidth;
		int houseArea;
		int houseLength;
		int houseWidth;
		double secNeeded;
		double totalMins;
		
		
		System.out.print("Enter the length of the yard(in yards): ");
		Scanner inputValues = new Scanner(System.in);
		yardLength = inputValues.nextInt();
		
		System.out.print("Enter the width of the yard(in yards): ");
		yardWidth = inputValues.nextInt();
		
		System.out.print("Enter the length of the house(in yards): ");
		houseLength = inputValues.nextInt();
		
		System.out.print("Enter the width of the house(in yards): ");
		houseWidth = inputValues.nextInt();
		

		
		
		
		inputValues.close();
		
		yardArea = yardLength * yardWidth;
		houseArea = houseLength * houseWidth;
		secNeeded =  (yardArea - houseArea ) / (2.75);
		totalMins = secNeeded / (60);
		totalMins = Math.round(totalMins * 100.0)/100.0 ; 
		
		
		
		System.out.println(yardArea + "," + houseArea);
		
		System.out.println("Time required to cut the grass is :" + totalMins);
		
		
	}

}
