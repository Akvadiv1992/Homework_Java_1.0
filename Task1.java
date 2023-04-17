import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        System.out.print("Введите число: ");
        int n = in.nextInt();
        System.out.printf("Треугольное число от "+ n + " = " + (0.5 * n * (n + 1)));
        }
    }
}