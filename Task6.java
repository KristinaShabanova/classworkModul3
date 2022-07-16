package com.company;

//Определить количество дней в году, который вводит
//пользователь, и вывести их в консоль. В високосном году –
//366 дней, тогда как в обычном – 365. Високосными годами
//являются все годы, делящиеся нацело на 4, за исключением
//столетий, которые не делятся нацело на 400.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Введите год: ");
        Scanner sc = new Scanner(System.in);
        int entryNum = sc.nextInt();

        if ((entryNum % 4 == 0) && (entryNum % 100 != 0) || (entryNum % 400 == 0)) {
            System.out.println("В этом году 366 дней");
        } else {
            System.out.println("В этом году 365 дней");
        }
    }
}
