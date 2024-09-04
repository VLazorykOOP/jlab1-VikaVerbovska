import java.util.Scanner;

public class PointsInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення радіуса r
        System.out.print("Введiть радiус r: ");
        double r = scanner.nextDouble();

        // Введення кількості елементів у масиві A
        System.out.print("Введiть кiлькiсть елементiв у масивi A (парне число): ");
        int n = scanner.nextInt();
        if (n % 2 != 0) {
            System.out.println("Кiлькiсть елементiв у масивi повинна бути парною!");
            return;
        }

        // Введення масиву A
        double[] A = new double[n]; //створюєм масив A з n елементів типу double, де будуть зберігатися введені користувачем числа.
        System.out.println("Введiть елементи масиву A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextDouble();
        }

        int count = 0; //зберігаєм кількість точок, що належать колу.

        // Перевірка, чи входять точки до кола
        for (int i = 0; i < n; i += 2) {
            double x = A[i];
            double y = A[i + 1];

            // Відстань від точки до початку координат
            double distance = Math.sqrt(x * x + y * y);

            if (distance <= r) {
                count++;
            }
        }

        // Виведення результату
        System.out.println("Кiлькiсть точок, що належать колу: " + count);
    }
}
