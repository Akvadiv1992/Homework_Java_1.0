//Вывести все простые числа от 1 до 1000 
//(числа, которые делятся только на 1 и на себя без остатка)

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> Number = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean Prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                Number.add(i);
            }
        }
        System.out.println("Простые числа от 1 до 1000:" + Number);
    }
}

