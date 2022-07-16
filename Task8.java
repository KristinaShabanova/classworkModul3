package com.company;

import java.util.Scanner;

//Даны два числа x и y. Программа должна вывести в консоль YES, – если оба числа четные, либо оба числа нечетные;
//иначе программа ничего не выводит.
public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите два числа.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int firstNum = sc.nextInt();
        System.out.print("Второе число: ");
        int secondNum = sc.nextInt();

        if ((firstNum % 2 == 0) && (secondNum % 2 == 0) || ((firstNum % 2 != 0) && (secondNum % 2 != 0)))
            System.out.println("YES");
    }
}
