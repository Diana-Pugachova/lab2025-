import java.util.Scanner;

public class ЛАБ1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;
        double x, y;

        System.out.print("Введіть координату X для точки M: ");
        if (input.hasNextDouble()) {
            x = input.nextDouble();
        } else {
            System.out.println("Помилка: введено нечислове значення для X.");
            return;
        }

        System.out.print("Введіть координату Y для точки M: ");
        if (input.hasNextDouble()) {
            y = input.nextDouble();
        } else {
            System.out.println("Помилка: введено нечислове значення для Y.");
            return;
        }

        if (y >= 0) {
            if (y >= x) {
                N = 1;
            } else {
                N = 4;
            }
        } else {
            if (y >= x) {
                N = 2;
            } else {
                N = 3;
            }
        }

        System.out.println("Результат:");
        System.out.println("Точка M(" + x + ", " + y + ") належить області N = " + N);
    }
}
