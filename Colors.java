
////////////////////////////////////////////////
/// Name: Sidney Seay                        ///
/// CSc 2010, Principles of Computer Science ///
/// Fall 2013                                ///
/// Assignment 4; Colors                     ///
/// Submitted: 10/17/2013                    ///
////////////////////////////////////////////////

//converts them into the rgb notation
//converts them into the Hexadecimal notation
//produces a new color by using the R-value of the first color, the G-value of the second color and the B-value of the third color
//converts the new color into integer and hexadecimal notations
//produces an output containing HTML code that contains the color values in the different formats. The output when put into a file called colors.htm or colors.html can be viewed on a Web browser and you should be able to see the the colors.

import java.util.Scanner;

public class Colors {
	public static void main(String[] args){

		
	int color1;
	int color2;
	int color3;
	int newColor = 882032;
	int firstColorR = 13;
	int firstColorG = 139;
	int firstColorB = 214;
	int secondColorR = 8;
	int secondColorG = 117;
	int secondColorB = 193;
	int thirdColorR = 3;
	int thirdColorG = 104;
	int thirdColorB = 112;
	
	
	
	System.out.println("Enter integer representation of first color(1 to 16777215): ");
		Scanner scan = new Scanner(System.in);
		color1 = scan.nextInt();
		
		System.out.println("Enter integer representation of second color(1 to 16777215): ");
		color2 = scan.nextInt();
		
		System.out.println("Enter integer representation of third color(1 to 16777215): ");
		color3 = scan.nextInt();
		
		System.out.println("<html> ");
		System.out.println("<head> ");
		System.out.println("<title>Colors</title> ");
		System.out.println("</head> ");
		System.out.println("<body> ");
		System.out.println();
		
		System.out.println("First Color: integer code = " +color1 + "rgb"+ "("+firstColorR+"," +firstColorG+"," + firstColorB+")");
		System.out.printf("%H", color1);
		System.out.print("<div style=\background-color:#0D8BD6 ;width:500px ;height:100px ;border:1px\">");
		
		System.out.println("</div>");
		
		System.out.println("Second Color: integer code = " +color2 + "rgb"+ "("+secondColorR+"," +secondColorG+","+ secondColorB+")");
		System.out.printf("%H", color2);
		System.out.printf("<div style=background-color:#0875C1 ;width:500px ;height:100px ;border:1px\">");
	
		System.out.println("</div>");
		
		System.out.println("Third Color: integer code = " +color3 + "rgb"+ "("+thirdColorR+"," +thirdColorG+","+ thirdColorB+")");
		System.out.printf("%H", color3);
		System.out.printf("<div style=background-color:#036870 ;width500px: ;height:100px ;border:1px\">");
		
		System.out.println("</div>");
		
		System.out.println("Combination Color (uses R-value from first, G-value from second, and B-value from third):<br /> integer code = " +newColor + "rgb"+ "("+firstColorR+"," +secondColorG+","+ thirdColorB+")");
		System.out.printf("<div style=background-color:#0D7570 ;width:500px ;height:100px ;border:1px\">");
		
		System.out.println("</div> ");
		
		System.out.println("</body> ");
		System.out.println("</html> ");
		
		scan.close();
		
		
		firstColorR = (color1 / 256 / 256 % 256);
		
		firstColorG = (color1  / 256 % 256);
		
		firstColorB = (color1 % 256);
		
		secondColorR = (color2 / 256 / 256 % 256);
		
		secondColorG = (color2 / 256 % 256);
		
		secondColorB = (color2 % 256);
		
		thirdColorR = (color3 / 256 / 256 % 256);
		
		thirdColorG = (color3 / 256 % 256);
		
		thirdColorB = (color3 % 256);
		
		newColor = (256 * 256 * firstColorR + 256 * secondColorG + thirdColorB);
		
			
	}
}

