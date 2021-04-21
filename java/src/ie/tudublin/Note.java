package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Note {
    // Private fields
    private char note;
    private int duration;
    private String name;


    // Constructor Chaining method
    public Note(TableRow row) {
        this(row.getChar("note"), row.getInt("duration"), row.getString("name"));
    }

    // Constructor method
    public Note(char note, int duration, String name) {
        this.note = note;
        this.duration = duration;
        this.name = name;
    }

    // Getters and Setters
    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() method
    @Override
    public String toString() {
        return "Note [note=" + note + ", duration=" + duration + ", name=" + name + "]";
    }
}
