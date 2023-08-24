package hw20;

import java.io.*;

public class File {
    // Функція для збереження строки у файл
    public static void saveToFile(String content, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
            System.out.println("Дані збережено у файл " + filename);
        } catch (IOException e) {
            System.out.println("Виникла помилка при збереженні у файл: " + e.getMessage());
        }
    }

    // Функція для зчитування даних з файлу
    public static String readFromFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            reader.close();
            return content.toString();
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
