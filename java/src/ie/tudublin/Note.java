package ie.tudublin;

public class Note {
    // Private fields
    private char note;
    private int duration;

    // Constructor methods
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
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


    // toString() method
    @Override
    public String toString() {
        return "Note [note=" + note + ", duration=" + duration + "]";
    }
}
