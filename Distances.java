////////////////////////////////////////////////
/// Name: Sidney Seay                        ///
/// CSc 2010, Principles of Computer Science ///
/// Fall 2013                                ///
/// Assignment 3; Distances Program          ///
/// Submitted: 10/1/2013                     ///
////////////////////////////////////////////////
import java.util.Scanner;
import java.lang.Math;

public class Distances {
	public static void main(String [] args){
		int xCoordinateA;
		int yCoordinateA;
		int xCoordinateB;
		int yCoordinateB;
		int xCoordinateC;
		int yCoordinateC;
		double distanceFromAToB;
		double distanceFromAToC;
		double distanceFromBToC;
		double maximum;
		double sum;
		
		
		System.out.print("Enter X-Coordinate of Point A: ");
		Scanner inputValues = new Scanner(System.in);
		xCoordinateA = inputValues.nextInt();
		
		System.out.print("Enter Y-Coordinate of Point A: ");
		yCoordinateA = inputValues.nextInt();
		
		System.out.print("Enter X-Coordinate of Point B: ");
		xCoordinateB = inputValues.nextInt();
		
		System.out.print("Enter Y-Coordinate of Point B: ");
		yCoordinateB = inputValues.nextInt();
		
		System.out.print("Enter X-Coordinate of Point C: ");
		xCoordinateC = inputValues.nextInt();
		
		System.out.print("Enter Y-Coordinate of Point C: ");
		yCoordinateC = inputValues.nextInt();
		
		
		
		inputValues.close();
		
		
		distanceFromAToB = Math.sqrt(Math.pow(xCoordinateB - xCoordinateA, 2) + Math.pow(yCoordinateB - yCoordinateA, 2));
		distanceFromAToC = Math.sqrt(Math.pow(xCoordinateC - xCoordinateA, 2) + Math.pow(yCoordinateC - yCoordinateA, 2));
		distanceFromBToC = Math.sqrt(Math.pow(xCoordinateC - xCoordinateB, 2) + Math.pow(yCoordinateC - yCoordinateB, 2));
		maximum = distanceFromAToC;
		sum = distanceFromAToB + distanceFromBToC;
		
				
		System.out.println(distanceFromAToB);
		
		System.out.println(distanceFromAToC);
		
		System.out.println(distanceFromBToC);
		
		System.out.println(maximum);
		
		System.out.println(sum);
		
		
		
		
		
		
		
		 
		
		
		
	}
}
