package hw27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Journal {
    private List<Note> notes;

    public Journal() {
        this.notes = new ArrayList<>();
    }

    public void addNote(String author, String content) {
        Note note = new Note(author, content);
        notes.add(note);
    }

    public void deleteNote(int index) {
        if (index >= 0 && index < notes.size()) {
            notes.remove(index);
        }
    }

    public void updateNote(int index, String newContent) {
        if (index >= 0 && index < notes.size()) {
            Note note = notes.get(index);
            note = new Note(note.getAuthor(), newContent);
            notes.set(index, note);
        }
    }

    public void displayNotes() {
        Iterator<Note> iterator = notes.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            System.out.println("Note " + index + ":\n" + iterator.next() + "\n");
            index++;
        }
    }
}