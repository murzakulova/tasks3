import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b *= i;
            if (i < a) {
                System.out.print(i + "*");
            } else {
                System.out.print(i + "=" + b);


            }

        }
    }
}