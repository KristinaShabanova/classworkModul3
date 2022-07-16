package com.company;

// Организовать ввод с клавиатуры даты рождения человека. Программа должна вывести знак зодиака и название
//года по китайскому календарю.
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.print("Day: ");
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();
        if (day <= 0 || day >=32) {
            System.err.println("Incorrect day, please try again!");
            System.exit(1);
        }

        System.out.print("Month: ");
        int month = sc1.nextInt();
        if (month <= 0 || month >=13) {
            System.err.println("Incorrect month, please try again!");
            System.exit(1);
        }

        System.out.print("Year: ");
        int year = sc1.nextInt();
        int yearZodiac = year % 12;
        if (year <= 0)
            System.err.println("Incorrect year, please try again!");

        if (day >= 21 & month == 3 || day <= 20 & month == 4)
            System.out.println("Овен");
        else if (day >= 21 & month == 4 || day <= 21 & month == 5)
            System.out.println("Телец");
        else if (day >= 22 & month == 5 || day <= 21 & month == 6)
            System.out.println("Близнецы");
        else if (day >= 22 & month == 6 || day <= 22 & month == 7)
            System.out.println("Рак");
        else if (day >= 23 & month == 7 || day <= 23 & month == 8)
            System.out.println("Лев");
        else if (day >= 24 & month == 8 || day <= 22 & month == 9)
            System.out.println("Дева");
        else if (day >= 23 & month == 9 || day <= 23 & month == 10)
            System.out.println("Весы");
        else if (day >= 24 & month == 10 || day <= 22 & month == 11)
            System.out.println("Скорпион");
        else if (day >= 23 & month == 11 || day <= 21 & month == 12)
            System.out.println("Стрелец");
        else if (day >= 22 & month == 12 || day <= 20 & month == 1)
            System.out.println("Козерог");
        else if (day >= 21 & month == 1 || day <= 18 & month == 2)
            System.out.println("Водолей");
        else System.out.println("Рыбы");

        switch (yearZodiac) {
            case (1) ->
                System.out.println("Петух");
            case (2) ->
                    System.out.println("Собака");
            case (3) ->
                    System.out.println("Свинья");
            case (4) ->
                    System.out.println("Крыса");
            case (5) ->
                    System.out.println("Бык");
            case (6) ->
                    System.out.println("Тигр");
            case (7) ->
                    System.out.println("Кролик");
            case (8) ->
                    System.out.println("Дракон");
            case (9) ->
                    System.out.println("Змея");
            case (10) ->
                    System.out.println("Лошадь");
            case (11) ->
                    System.out.println("Коза");
            default ->
                    System.out.println("Обезьяна");
        }
    }
}
