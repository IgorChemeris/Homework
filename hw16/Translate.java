package hw16;

import java.util.HashMap;
import java.util.Map;

public class Translate {
    public static void main(String[] args) {
        Map<String, String[]> translations = new HashMap<>();
        translations.put("Привіт", new String[]{"Hello", "こんにちは", "Hallo"});
        translations.put("До побачення", new String[]{"Goodbye", "さようなら", "Auf Wiedersehen"});
        translations.put("Дякую", new String[]{"Thank you", "ありがとう", "Danke"});
        translations.put("Машина", new String[]{"Car", "マシーン", "Maschine"});
        translations.put("Літак", new String[]{"Plane", "飛行機", "Ebene"});
        translations.put("Робота", new String[]{"Work", "仕事", "Arbeiten"});
        translations.put("Собака", new String[]{"Dog", "犬", "Hund"});
        translations.put("Кіт", new String[]{"Cat", "猫", "Katze"});
        translations.put("Квартира", new String[]{"Apartment", "アパート", "Wohnung"});
        translations.put("Дружба", new String[]{"Friendship", "友情", "Freundschaft"});

        //Приклад
        String word = "Дякую";
        if (translations.containsKey(word)) {
            String[] translatedWords = translations.get(word);
            System.out.println("Переклад слова \"" + word + "\":");
            System.out.println("Англійська: " + translatedWords[0]);
            System.out.println("Японська: " + translatedWords[1]);
            System.out.println("Німецька: " + translatedWords[2]);
        } else {
            System.out.println("Переклад для слова \"" + word + "\" не знайдено в словнику.");
        }

    }
}
