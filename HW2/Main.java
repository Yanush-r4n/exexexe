package HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Введите информацию в данном порядке:
                [Фамилия] [Имя] [Отчество] [Дата рождения] [Номер телефона] [Пол]
                Для [Дата рождения] используйте формат "dd.mm.yyyy";
                [Номер телефона] вводите без разделитерей и знаков;
                [Пол] укажите как один из символов, либо m, либо f.""");

        String userInfo = scanner.nextLine();
        User user = new User();
        try {
            user = parsingUserInfo(userInfo);
        } catch (InfoFormatException | QuantityOfFieldsException e) {
            e.printStackTrace();
            System.exit(0);
        }

        try (FileWriter file = new FileWriter(user.getLastName() + ".txt", true)) {
            file.write(user.getLastName() + " " + user.getName() + " " + user.getMiddleName() + ", " +
                    user.getBirthDate() + ", " + user.getPhoneNumber() + ", " + user.getSex() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User parsingUserInfo(String userInfo) throws InfoFormatException, QuantityOfFieldsException {
        int requiredFieldsNumber = 6;
        String[] parsedInfo = userInfo.split(" ");
        if (parsedInfo.length != requiredFieldsNumber) {
            throw new QuantityOfFieldsException(requiredFieldsNumber, parsedInfo.length);
        }
        User newUser = new User();
        newUser.setLastName(parsedInfo[0]);
        newUser.setName(parsedInfo[1]);
        newUser.setMiddleName(parsedInfo[2]);
        newUser.setBirthDate(parsedInfo[3]);
        newUser.setPhoneNumber(parsedInfo[4]);
        newUser.setSex(parsedInfo[5]);
        return newUser;
    }
}
