// Task_2.
// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все введённые выше числа. Выведите на экран результат умножения построчно.



import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        System.out.print("Введите множитель: ");
        int multiplier = scanner.nextInt();

        
        System.out.print("Результат умножения будет: ");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i] * multiplier);
        }
    }
}
