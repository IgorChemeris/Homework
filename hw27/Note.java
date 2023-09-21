package hw27;

import java.util.Date;

public class Note {
    private String author;
    private String content;
    private Date timestamp;

    public Note(String author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Author: " + author + "\n" +
                "Timestamp: " + timestamp + "\n" +
                "Content: " + content;
    }
}