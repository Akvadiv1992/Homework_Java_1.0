import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1ое число: ");
        int inputNum1 = scanner.nextInt();
        System.out.print("Введите действие: ");
        String math = scanner.next();
        System.out.print("Введите 2ое число: ");
        int inputNum2 = scanner.nextInt();
    try {
        double result = calc(inputNum1, inputNum2, math);
        System.out.println("Ответ: " + result);
    } catch (RuntimeException end){
        System.out.println(end.getMessage());
        }
    }
public static double calc (double inputNum1, double inputNum2, String operation){
    switch (operation){
        case "+":
            return inputNum1+inputNum2;
        case "-":
            return inputNum1-inputNum2;
        case "*":
            return inputNum1*inputNum2;
        case "/":
            return inputNum1/inputNum2;
        default:
            throw new RuntimeException("действие не найдено");
        }
    }
}
