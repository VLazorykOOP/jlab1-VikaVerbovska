public class Main {

    public static void main(String[] args) {
        String text = "Цей приклад включає кiлька слiв рiзної довжини, наприклад: дуже, довгих, коротких.";

        // Виклик функції для вилучення найдовших слів
        String result = removeLongestWords(text);
        System.out.println("Текст пiсля вилучення найдовших слiв:");
        System.out.println(result);
    }

    public static String removeLongestWords(String text) {
        String[] words = text.split("(?<=\\s)|(?=\\s)|(?=\\p{Punct})|(?<=\\p{Punct})");
        int maxLength = 0;

        // Знаходимо максимальну довжину слова
        for (String word : words) {
            if (!word.matches("\\p{Punct}")) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
        }

        // Створюємо результативний рядок
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() != maxLength || word.matches("\\p{Punct}")) {
                result.append(word);
            }
        }

        return result.toString();
    }
}
