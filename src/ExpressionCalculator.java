import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення даних
        System.out.print("Введiть значення x: ");
        double x = scanner.nextDouble();
        System.out.print("Введiть значення y: ");
        double y = scanner.nextDouble();

        // Перевірка, що x не дорівнює y (оскільки є ділення на (x - y))
        if (x == y) {
            System.out.println("Помилка: x не може дорiвнювати y.");
            return;
        }

        // Варіант 1: Вхідні дані дійсного типу, результат – дійсного
        double result1 = 1 / (x * y) + 1 / (x * x + y * y) * (x - y);
        System.out.println("Результат (вхiднi данi: дiйснi, результат: дiйсний): " + result1);

        // Варіант 2: Вхідні дані цілого типу, результат – дійсного
        int xInt = (int) x;
        int yInt = (int) y;
        double result2 = 1.0 / (xInt * yInt) + 1.0 / (xInt * xInt + yInt * yInt) * (xInt - yInt);
        System.out.println("Результат (вхiднi данi: цiлi, результат: дiйсний): " + result2);

        // Варіант 3: Вхідні дані дійсного типу, результат – цілого
        int result3 = (int) (1 / (x * y) + 1 / (x * x + y * y) * (x - y));
        System.out.println("Результат (вхiднi данi: дiйснi, результат: цiлий): " + result3);
    }
}
