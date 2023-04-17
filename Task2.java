import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int Number = in.nextInt();
        int fac = factorial(Number);
        System.out.printf("Факториал !%d = %d", Number, fac);
    }
    public static int factorial(int Number) {
        int result = 1;
        int count = 1;
        while (count <= Number){
            result *= count;
            count++;
        }
        return result;
    }
}

