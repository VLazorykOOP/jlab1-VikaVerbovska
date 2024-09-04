import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "Цей приклад включає кiлька слiв рiзної довжини, наприклад: дуже, довгих, коротких.";

        // Виклик функції для вилучення найдовших слів
        String result = removeLongestWords(text);
        System.out.println("Текст пiсля вилучення найдовших слiв:");
        System.out.println(result);
    }

    public static String removeLongestWords(String text) {
        // Розділяємо текст на слова, враховуючи пробіли і розділові знаки
        String[] words = text.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");
        int maxLength = 0;
        
        // Знаходимо максимальну довжину слова
        for (String word : words) {
            // Ігноруємо розділові знаки
            if (!word.matches("\\p{Punct}")) {
                maxLength = Math.max(maxLength, word.length());
            }
        }
        
        List<String> resultWords = new ArrayList<>();
        
        // Додаємо слова, які не є найдовшими
        for (String word : words) {
            if (word.length() != maxLength || word.matches("\\p{Punct}")) {
                resultWords.add(word);
            }
        }
        
        // Повертаємо результуючий текст
        return String.join("", resultWords);
    }
}
