package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Пользователь вводит с клавиатуры букву. Программа
//должна определить, в какой раскладке введена буква – в латинской или кирилице. Вывести в консоль: «латиница», если
//буква введена латиницей или «кирилица», если буква относится к кирилическому алфавиту. Если введена цифра, а не
//буква, вывести «цифра». Если символ не относится ни к буквам, ни к цифрам, вывести «невозможно определить».
public class Task7 {
    public static void main(String[] args) {
        System.out.print("Введите букву: ");
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();

        Pattern latLetter = Pattern.compile("[a-zA-z]");
        Matcher latinLetter = latLetter.matcher(letter);
        Pattern kirLetter = Pattern.compile("[а-яА-Я]");
        Matcher kirilLetter = kirLetter.matcher(letter);
        if (kirilLetter.matches()) {
            System.out.println("Это кириллица");
        }
        else if (latinLetter.matches()){
            System.out.println("Это латиница");
        } else {
            System.err.println("Не допустимый символ!");
        }
    }
}
