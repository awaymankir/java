// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.


import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        // Ввод второго числа
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Ввод оператора действия
        System.out.print("Введите оператор действия (+, -, *, /): ");
        String operator = scanner.next();

        // Вычисление результата
        int result = 0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль невозможно!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Неверный оператор!");
                return;
        }

        // Вывод результата
        System.out.println("Результат вычисления: ");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}