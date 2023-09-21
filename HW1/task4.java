package HW1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        printString();
    }

    private static void printString() {
        System.out.println("Введите сообщение:");
        Scanner sc = new Scanner(System.in);
        try {
            String userInput = sc.nextLine().trim();
            if (userInput.equals("")) {
                throw new RuntimeException("Мы не уважаем пустые строки, им тут не рады, потому вводить их нельзя.");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
