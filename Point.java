//Name: Sidney Seay
//CSc 2010, Principle of Computer Science
//Fall 2013
//Assignment 6; Point Program
//Submitted: 10-31-13

public class Point {
	
	//Instance Variables
	private String p;
	private double xCoordinate;
	private double yCoordinate;
	
	
	//Constructor(Initializes the instance variables)
	public Point(double x, double y, String name) {
	xCoordinate = x;
	yCoordinate = y;
	p = name;
	}

	//Getters
	public double getX () {
		return xCoordinate;		
	}
	public double getY () {
		return yCoordinate;
	}
	public String getName () {
		return p;
	}
		//Setters
		public void setX(double number) {
			xCoordinate = number;
			
		}
		public void setY(double number) {
			yCoordinate = number;
		}
 		public void setName(String number) {
 			p = number;
 		}
 		//Instance Methods
 		public double distanceTo(Point p) {
			return Math.sqrt(Math.pow(p.getX() - xCoordinate, 2) + Math.pow(p.getY() - yCoordinate, 2));	
		}
		public Point midpointTo(Point p) {
			return new Point((p.getX() + xCoordinate) / 2, (p.getY() + yCoordinate) / 2, "Mid");
		}
		public String toString() {
//			A(2.5,33.3)
			return getName() + "(" + getX() + "," + getY() + ")";
		}
}
			
