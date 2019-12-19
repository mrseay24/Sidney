////////////////////////////////////////////////
/// Name: Marcus Berry                       ///
/// CSc 2010, Principles of Computer Science ///
/// Fall 2013                                ///
/// Assignment 9; Histogram Program          ///
/// Submitted: 12/2/2013                     ///
////////////////////////////////////////////////

//This program will produce a histogram plot of the frequency of occurrences
//of letters in a text file and produce a jpg file that contains a histogram plot.

import java.util.Scanner; 
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.Color;
import java.awt.Graphics;

public class Histogram {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Created Scanner for user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data file name:");
		String fname = sc.nextLine();
		
		//Created Scanner to read files
		File inputFile = new File("/Users/administrator/Documents/workspace/Histogram/src/"+ fname + ".txt");
		Scanner reader = new Scanner(inputFile);
		
		//Created window to display histogram	
		DrawingPanel p = new DrawingPanel(1050,600);
		Graphics g = p.getGraphics();
		
		//Created arrays in order to keep track of letter counts
		int[] letterCounts = new int[26];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
		                    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String line;
		while ((reader.hasNextLine())) {
			line=reader.nextLine().trim().toUpperCase();
			System.out.println (line);
			
			for (int i = 0; i < line.length(); i++){
				char ch = line.charAt(i) ;
				if ('A' <= ch && ch <= 'Z'){
					letterCounts[ch - 'A']++;
					letters[ch-'A']++;
					System.out.println (letterCounts [1]);
					g.setColor(Color.BLACK);
					g.drawString("A      B      C      D      E      F      G      H      I      J      K      L      "
							+ "M      N      O      P      Q      R      S      T      U      V      W      X      Y   "
							+ "   Z ", 25, 579);
					g.setColor(Color.BLUE);
					g.drawRect(20, letterCounts [0], 20, 542);
					g.drawRect(60, letterCounts [1], 20, 542);
			}
			}
		//Created window	
		//DrawingPanel p = new DrawingPanel(1050,600);
		//int height = (int) 400.0*letterCounts[i]/highestCount;		
			}
		
	
	}
}	