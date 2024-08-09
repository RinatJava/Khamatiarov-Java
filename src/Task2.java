import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("*********Программа для сравнения строк*********");
        System.out.println("Введите первую строку (a): ");
        String a = new Scanner(System.in).nextLine();
        System.out.println("a" + " = " + a);
        System.out.println("Введите вторую строку (b): ");
        String b = new Scanner(System.in).nextLine();
        System.out.println("b" + " = " + b);
        System.out.println("Проверяем равенство строк:");
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
