//Name: Sidney Seay
//CSc 2010, Principle of Computer Science
//Fall 2013
//Assignment 6; TestPoint Program
//Submitted: 10-31-13

import java.util.Scanner;

public class TestPoint {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
//		Point p = new Point();
		
		double x1, y1, x2, y2, x3, y3;
		double d1, d2, d3;
		double maxDist;
		double sumDist;
		Point A, B, C;
		
		System.out.print("Enter x and y coordinates of Point A separated by spaces: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		A = new Point(x1,y1, "A");
		
		System.out.print("Enter x and y coordinates of Point B separated by spaces: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		B = new Point(x2, y2, "B");
		
		System.out.print("Enter x and y coordinates of Point C separtated by spaces: ");
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		C = new Point(x3, y3, "C");
		
//		System.out.print( "");
		d1 = A.distanceTo(B);
		d2 = A.distanceTo(C);
		d3 = B.distanceTo(C);
		
		System.out.println("Distance between Point " + A+"and Point " +B+ "is " + d1);
		System.out.println("Distance between Point " + A+"and Point " +C+ "is " + d2);
		System.out.println("Distance between Point " + B+"and Point " +C+ "is " + d3);
		maxDist = Math.max(d1, Math.max(d2,d3));
		sumDist = d1 + d2 +d3 - maxDist;
		System.out.println("The maximum distance is "+maxDist);
		System.out.println("The sum of the other two distances is "+sumDist);
		System.out.println("Midpoint between Point " + A+"and Point " +B+ "is Point " + A.midpointTo(B));
		System.out.println("Midpoint between Point " + A+"and Point " +C+ "is Point " + A.midpointTo(C));
		System.out.println("Midpoint between Point " + B+"and Point " +C+ "is Point " + B.midpointTo(C));
		
		
		
		
		
		input.close();
	}

	}
