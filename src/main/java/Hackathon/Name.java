package Hackathon;
import java.util.Scanner;

public class Name {
    private static String userName = "";

    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Вы не ввели имя");
            return false;
        }
        if (name.equalsIgnoreCase("Выйти")) {
            System.exit(0);
        }
        if (name.matches(".*\\d.*")) {
            System.out.println("Введите имя без чисел");
            return false;
        } else if (name.matches(".*\\s.*\\w*.")) {
            System.out.println("Введите только имя");
            return false;
        } else
            System.out.println("Добро пожаловать, " + name.substring(0, 1).toUpperCase() + name.substring(1) + "!");
        return true;
    }

    public static String entryName() {
        System.out.println("Введите своё имя:");
        return new Scanner(System.in).nextLine();
    }

    public static String regName() {
        System.out.println("Добрый день!");
        do {
            userName = entryName();
        } while (!checkName(userName));
        return userName;
    }
}
