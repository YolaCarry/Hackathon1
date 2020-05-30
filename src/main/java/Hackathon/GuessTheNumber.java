package Hackathon;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private static Random random = new Random();
    private static int i = random.nextInt(100);

    public static boolean checkNum(int number) {
        System.out.println("Для выхода введите 0");
        if (number == 0) {
            System.out.println("Спасибо за игру!");
            return true;
        }
        if (number > i) {
            System.out.println("Ваше число больше загаданного");
            return false;
        } else if (number < i) {
            System.out.println("Ваше число меньше загаданного");
            return false;
        } else {
            System.out.println("Поздравляю, вы выиграли!");
            i = random.nextInt(100);
        }
        return true;
    }

    public static int entryNum() {
        try {
            System.out.println("Введите число от 0 до 100");
            return new Scanner(System.in).nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Нужно ввести число!");
            return entryNum();
        }
    }
}