// OOP Labtest 2021
// Andrew Kennan
// C19429514

package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	// String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";


	// Array List
	ArrayList<Note> note = new ArrayList<Note>();

	// Loading the score
	void loadScore() {
		for (int i = 0; i < score.length() - 1; i++) {
			char c = score.charAt(i);
			char cc = score.charAt(i + 1);

			boolean checki, checki1;
			checki = Character.isDigit(c);
			checki1 = Character.isDigit(cc);
			if (checki == false) {
				if (checki1 == false) {
					note.add(new Note(c, 1));
				}
				else {
					note.add(new Note(c, 2));
				}
			}
		}
	}

	// Printing the scores
	void printScore() {
		for(Note n : note) {
			// n.display();
			System.out.println(n);
		}
	}
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		// println(i);
	}

	public void setup() 
	{
		colorMode(RGB);
		loadScore();
		printScore();
	}

	public void draw()
	{
		background(255);
		float border = width * 0.1f;
		for (int i = 0; i < 5; i ++) {
			stroke(0, 0, 0);
			float y = map(i, 0, 10, border*2, height - border);
			line(border, y, width - border, y);
		}

		drawNotes();
	}

	void drawNotes()
	{
		float border = width * 0.1f;

		for (int i = 0; i < note.size(); i++) {
			float x = map(i, 0, (float) note.size(), border, width - border);
			float y = map(note.get(i).getNote() - 60, 0, 8, border*2, border*2+40);

			if(pmouseX < x+10 && pmouseX > x-10) {
				fill(255, 0, 0);
				stroke(255, 0, 0);
			}
			else {
				fill(0, 0, 0);
				stroke(0, 0, 0);
			}
			text(note.get(i).getNote(), x, height / 4);
			circle(x, y, 20);
			line(x+10, y, x+10, y - 40);
			if(note.get(i).getDuration() == 1) {
				line(x+10, y - 40, x+20, y - 30);
			}
		}
	}
}