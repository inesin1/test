import java.util.Scanner;

public class Main {
public static int operand1;
public static int operand2;
public static int result;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число: ");
        if (scanner.hasNextInt()) {
            operand1 = scanner.nextInt(); //считывает число
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        System.out.print("Операция (+, -, *, /): ");
        char operation = scanner.next().charAt(0); //считывает операцию

        if ((operation != '+') & (operation != '-') & (operation != '*') & (operation != '/')){
            System.out.println("Извините, но эта операция не поддерживается. Перезапустите программу и попробуйте снова!");
        }

        System.out.print("Второе число: ");
        if (scanner.hasNextInt()) {
            operand2 = scanner.nextInt(); //считывает второе число
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        }

        System.out.print("\nРезультат вычислений: ");

        switch(operation) {
            case '+':
                result = sum(operand1, operand2);
                break;
            case '-':
                result = diff(operand1, operand2);
                break;
            case '*':
                result = mult(operand1, operand2);
                break;
            case '/':
                result = segm(operand1, operand2);
                break;
        }

        System.out.println(result);
    }

    public static int sum(int operand1, int operand2) {
        int result = operand1 + operand2;
        return result;
    }

    public static int diff(int operand1, int operand2) {
        int result = operand1 - operand2;
        return result;
    }

    public static int mult(int operand1, int operand2) {
        int result = operand1 * operand2;
        return result;
    }

    public static int segm(int operand1, int operand2) {
        int result = operand1 / operand2;
        return result;
    }
}