import java.util.Scanner;

public class MatrixLogicVector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введiть розмiр матрицi n (n <= 15): ");
        int n = scanner.nextInt();
        
        if (n > 15 || n <= 0) {
            System.out.println("Невiрний розмiр матрицi.");
            return;
        }

        int[][] matrix = new int[n][n]; // Створюємо двомірний масив для зберігання матриці розміром n x n
        boolean[] L = new boolean[n]; // Створюємо масив для зберігання логічного вектора
        
        System.out.println("Введiть елементи матрицi:");
        for (int i = 0; i < n; i++) {   // Проходимо по кожному рядку матриці
            int negativeCount = 0, positiveCount = 0; // Ініціалізуємо лічильники для від'ємних і додатніх чисел
            for (int j = 0; j < n; j++) {   // Проходимо по кожному стовпчику рядка
                matrix[i][j] = scanner.nextInt();  // Зчитуємо елемент матриці
                if (matrix[i][j] < 0) negativeCount++; // Якщо елемент від'ємний, збільшуємо лічильник від'ємних чисел
                else if (matrix[i][j] > 0) positiveCount++; // Якщо елемент додатній, збільшуємо лічильник додатніх чисел
            }
            L[i] = negativeCount > positiveCount;  // Встановлюємо значення логічного вектора: true, якщо від'ємних чисел більше, ніж додатніх
        }
        
        System.out.println("Логiчний вектор L(n):");
        for (boolean value : L) { // Проходимо по всім значенням логічного вектора
            System.out.print(value + " ");
        }
    }
}
