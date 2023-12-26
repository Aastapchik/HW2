import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 задача
        int k = scanner.nextInt();
        if (k % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        //2 задача
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }

        //3 задача
        System.out.println("Квадраты чисел от 10 до 20: ");
        for (int i = 10; i <= 20; i++)
            System.out.print(i * i + " ");

        //4 задача
        int q = 1;
        while (q < 15) {
            System.out.print(7 * q + " ");
            q++;
        }
        System.out.println(" ");

        //* задача

        System.out.print("Введите целое положительно число: ");
        if (scanner.hasNextInt()) {
            int h = scanner.nextInt();
            if (h > 0) {
                System.out.println("Сумма равна: " + (h * (h + 1) / 2));
            }
        } else {
            System.out.println("Число не подходит по критериям");
        }
        scanner.close();
    }
}
