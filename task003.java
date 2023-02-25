// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.Scanner;
import java.util.Objects;

public class task003 {
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;
    }
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
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
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        System.out.printf("Ваша функция: "+"%d %s %d", num1, operations, num2);
        System.out.println(","+" "+"для выполнения вычислений введите: ok, для отмены: no");
        String send = scanOperations();
        if (Objects.equals(send, "ok")) {
            int result = getResult(operations, num1, num2);
            System.out.printf("%d %s %d = %d", num1, operations, num2, result);
        }
        else {
            System.out.println("Задайте новую функцию:");
            main(args);
        }
    }
}

