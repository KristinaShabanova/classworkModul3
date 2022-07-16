package com.company;

import java.util.Scanner;

//Программа запрашивает шестизначное число. После ввода определяет,
// будет ли являться «счастливым» билет с таким номером (сумма первых трех цифр совпадает с суммой
//трех последних)
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое шестизначное число: ");
        int num = sc.nextInt();
        int first = num % 10 + (num % 100) /10 + (num % 1000) /100;
        int second = (num % 10000) / 1000 + (num % 100000) /10000 + (num % 1000000) /100000;
        int count = 0;
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++){
            count++;
        }
        if (first == second)
            System.out.println("Это 'счастливый' билет");
        else if (count != 6)
            System.err.println("Вы ввели неправильное число");
        else System.err.println("У вас не счастливый билетик, попробуйте в следующий раз!");
    }
}
