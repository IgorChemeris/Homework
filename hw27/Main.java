package hw27;

public class Main {
    public static void main(String[] args) {
        Journal journal = new Journal();

        // Додавання нотаток
        journal.addNote("Автор 1", "Зміст нотатки 1");
        journal.addNote("Автор 2", "Зміст нотатки 2");

        // Відображення нотаток
        journal.displayNotes();

        // Оновлення нотатки
        journal.updateNote(0, "Новий зміст нотатки 1");

        // Видалення нотатки
        journal.deleteNote(1);

        // Відображення оновленого журналу
        journal.displayNotes();
    }
}
