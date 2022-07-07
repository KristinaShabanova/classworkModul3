import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        if (time >= 0 && time <6){
            System.out.println("Доброй ночи");
        } else if (time > 6 && time < 12) {
            System.out.println("Доброе утро");
        } else if (time > 12 && time < 18) {
            System.out.println("Добрый день");
        } else if (time > 18 && time < 24) {
            System.out.println("Добрый вечер");
        }

    }
}
