package Hackathon;
import java.util.Random;
import java.util.Scanner;

public class RiddleTheNumber {
    private static final int MIN = 0;
    private static final int MAX = 100;

    public static boolean programGuess() {
        int min = MIN;
        int max = MAX;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int resNum = rnd.nextInt(max - min) + min;
        while (true) {
            try {
                System.out.println("Если вдруг захотите выйти, то введите \"Выйти\"");
                System.out.println("Если ваше число больше, введите \"Больше\", если меньше, введите \"Меньше");
                System.out.println("Если число верно, введите \"правильно\".");
                System.out.println(resNum);
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("Выйти")){
                    return true;
                }
                if (input.equalsIgnoreCase("Меньше")) {
                    max = resNum;
                    resNum = rnd.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("Больше")) {
                    min = resNum + 1;
                    resNum = rnd.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("Правильно")) {
                    System.out.println("Ваше число было отгадано, искуственный интелект победил!");
                    return true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Мне кажется или вы меня обманываете? Ваше число" + resNum);
                return true;
            }
        }
    }
    public static boolean checkRiddle(String word) {
        return word.equalsIgnoreCase("Загадал");
    }
}
