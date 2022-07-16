package com.company;

import java.util.Scanner;

//Написать программу, которая предлагает пользователю
//выбрать животное из списка (1 – кошка, 2 – собака и т.д.), и в
//ответ показывает, какие звуки издает выбранное животное.
//В списке должно быть не менее 10 животных.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("""
                Выберите животное из списка:
                1 - кошка
                2 - собака
                3 - корова
                4 - мышь
                5 - лошадь
                6 - утка
                7 - курица
                8 - ворона
                9 - слон
                10 - коза""");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер животного: ");
        int animal = sc.nextInt();
        switch (animal) {
            case (1) ->
                System.out.println("Мяу");
            case (2) ->
                System.out.println("Гав");
            case (3) ->
                System.out.println("Му");
            case (4) ->
                System.out.println("Пи-пи-пи");
            case (5) ->
                System.out.println("Иго-го");
            case (6) ->
                System.out.println("Кря");
            case (7) ->
                System.out.println("Ко-ко");
            case (8) ->
                System.out.println("Кар");
            case (9) ->
                System.out.println("Ту-ту");
            case (10) ->
                System.out.println("Ме");
            default ->
                System.err.println("Неверное значение");
        }
    }
}
