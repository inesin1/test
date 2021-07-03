import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueDecryp = true;

        do {
            int numbers = scanner.nextInt();

            char word = (char) numbers;

            System.out.print(word + " Продолжить? -");

        } while (continueDecryp == true);
    }
}
//afafafafa
