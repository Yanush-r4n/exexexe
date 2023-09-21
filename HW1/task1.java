package HW1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println(floatNumber());
    }

    private static float floatNumber() {
        Scanner sc = new Scanner(System.in);
        float userInput;

        System.out.println("Введите дробное число. Или не дробное. В качестве разделителя используйте точку.");
        while (true) {
            try {
                userInput = Float.parseFloat(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("В вводимых данных есть нечто кроме цифр и точки. Такое не поддерживается.");
                continue;
            }
            break;
        }

        return userInput;
    }
}
