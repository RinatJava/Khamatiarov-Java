public class Task3 {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        System.out.println("*******Программа определения четных чисел в массиве*******");
        System.out.println("Четные числа в массиве: ");
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
