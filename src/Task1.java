import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("********Программа для сравнения двух целых чисел*******");
        System.out.println("Введите первое число (a): ");
        String a = new Scanner(System.in).nextLine();
        int numA;
        while (true) {
            if (!a.matches("\\d+")) {
                System.out.println("Нужно ввести целое число!");
                System.out.println("Введите первое число (a): ");
                a = new Scanner(System.in).nextLine();
            } else {
                numA = Integer.parseInt(a);
                System.out.println("a" + " = " + a);
                break;
            }
        }
        System.out.println("Введите второе число (b): ");
        String b = new Scanner(System.in).nextLine();
        int numB;
        while (true) {
            if (!b.matches("\\d+")) {
                System.out.println("Нужно ввести целое число!");
                System.out.println("Введите второе число (b): ");
                b = new Scanner(System.in).nextLine();
            } else {
                numB = Integer.parseInt(b);
                System.out.println("b" + " = " + b);
                break;
            }
        }
        if (numA > numB) {
            System.out.println("Сравниваем числа: ");
            System.out.println("a > b");
        } else if (numA < numB) {
            System.out.println("Сравниваем числа: ");
            System.out.println("a < b");
        } else {
            System.out.println("Сравниваем числа: ");
            System.out.println("a = b");
        }

    }
}
