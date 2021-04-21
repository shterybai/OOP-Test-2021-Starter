package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";


	// Array List
	ArrayList<Note> note = new ArrayList<Note>();

	void loadScore() {
		Table table = loadTable("notes.csv", "header");

		for(TableRow row : table.rows()) {
			Note n = new Note(row);
			note.add(n);
		}
	}

	
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
		
	}

	public void draw()
	{
		background(255);
		
	}

	void drawNotes()
	{
	}
}
