package Hackathon;
import java.util.Scanner;

public class Games {
    private static int num = 0;
    private static Scanner scanner = new Scanner(System.in);
    private static String word = "";

    public static void chooseTheGame() {
        String choose = scanner.nextLine();
        if (choose.equalsIgnoreCase("Выйти")) {
            System.out.println("Спасибо за игру!");
            System.exit(0);
        }
        if (choose.equalsIgnoreCase("Угадать число")) {
            do {
                num = GuessTheNumber.entryNum();
            } while (!GuessTheNumber.checkNum(num));
        } else if (choose.equalsIgnoreCase("Загадать число")) {
            do {
                System.out.println("Если вдруг захотите выйти, то введите \"Выйти\"");
                System.out.println("Загадайте число от 0 до 100: ");
                System.out.println("Как будете готовы напишите \"Загадал\"");
                word = scanner.nextLine();
            } while (!RiddleTheNumber.checkRiddle(word));
            RiddleTheNumber.programGuess();
        }
    }

    public static void playTheGames () {
        System.out.println("Предлагаю вам сыграть в две игры:");
        do {
            System.out.println("Выберите игру: \"Угадать число\" или \"Загадать число\"");
            System.out.println("Если вдруг захотите выйти, то введите \"Выйти\"");
            System.out.println("                     ");
            System.out.println("Введите название игры");
            chooseTheGame();
        } while (true);
    }
}
