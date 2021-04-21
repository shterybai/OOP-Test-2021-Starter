package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	// String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";


	// Array List
	ArrayList<Note> note = new ArrayList<Note>();

	// Loading the score
	void loadScore() {
		for (int i = 0; i < score.length(); i++) {
			// String s = score.substring(i);
			// String ss = score.substring(score.charAt(i + 1));

			char c = score.charAt(i);
			char cc = score.charAt(i + 1);

			boolean checki, checki1;
			checki = Character.isDigit(c);
			checki1 = Character.isDigit(cc);
			if (checki == false) {
				if (checki1 == false) {
					System.out.println(c + "1" + "Quaver");
					// note.add(new Note(c, 1));
				}
				else {
					System.out.println(c + "2" + "Crotchet");
					// note.add(new Note(c, 2));
				}
			}
		}
	}

	// Printing the scores
	// void printScore() {
	// 	for (int i = 0; i < score.length(); i++) {
	// 		Note n = note.get(i);
	// 		System.out.println(n);
	// 	}
	// }
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		loadScore();
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
