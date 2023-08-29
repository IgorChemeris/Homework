package hw21;

import java.io.IOException;
        import java.nio.charset.StandardCharsets;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;

public class FileNio {
    // Функція для збереження строки у файл
    public static void saveToFile(String content, String filename) {
        try {
            Path filePath = Paths.get(filename);
            Files.write(filePath, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("Дані збережено у файл " + filename);
        } catch (IOException e) {
            System.out.println("Виникла помилка при збереженні у файл: " + e.getMessage());
        }
    }

    // Функція для зчитування даних з файлу
    public static String readFromFile(String filename) {
        try {
            Path filePath = Paths.get(filename);
            byte[] fileBytes = Files.readAllBytes(filePath);
            return new String(fileBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Виникла помилка при зчитуванні з файлу: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String dataToSave = "Це приклад збереження даних у файл та їх подальше зчитування.";
        String filename = "data.txt";

        // Збереження даних у файл
        saveToFile(dataToSave, filename);

        // Зчитування даних з файлу та виведення на консоль
        String readData = readFromFile(filename);
        if (readData != null) {
            System.out.println("Зчитані дані з файлу:");
            System.out.println(readData);
        }
    }
}