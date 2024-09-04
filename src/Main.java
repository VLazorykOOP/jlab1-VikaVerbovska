public class Main {

    public static void main(String[] args) {
        String text = "Вчора був сонячний день, сьогодні вже похумуро.";

        // Виклик функції для вилучення найдовших слів
        String result = removeLongestWords(text);
        System.out.println("Текст пiсля вилучення найдовших слiв:");
        System.out.println(result);
    }

    public static String removeLongestWords(String text) {
        String[] words = text.split("(?<=\\s)|(?=\\s)|(?=\\p{Punct})|(?<=\\p{Punct})"); //Розбиваємо текст на слова та розділові знаки за допомогою регулярного виразу. 
        int maxLength = 0; //Оголошуємо змінну maxLength, яка буде зберігати довжину найдовшого слова, яке ми знайдемо.

        // Знаходимо максимальну довжину слова
        for (String word : words) { 
            if (!word.matches("\\p{Punct}")) { //Перевіряєм, чи не є word розділовим знаком. 
                if (word.length() > maxLength) {
                    maxLength = word.length();
                }
            }
        }

        // Створюємо результативний рядок
        StringBuilder result = new StringBuilder();
        for (String word : words) { //Розпочинаємо новий цикл для перебору всіх слів.
            if (word.length() != maxLength || word.matches("\\p{Punct}")) { //Перевіряємо, чи довжина слова не дорівнює maxLength, або чи є слово розділовим знаком.
                result.append(word);
            }
        }

        return result.toString(); //Повертаємо рядок, побудований з усіх слів, крім найдовших.
    }
}
