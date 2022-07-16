package com.company;

import java.util.Scanner;

//Определить номер подъезда девятиэтажного дома, по
//указанному номеру квартиры N. Считать, что на каждом
//этаже находится M квартир. Вывести в консоль номер подъезда.
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Ведите номер квартиры от 1 до 144");
        Scanner sc = new Scanner(System.in);
        System.out.print("Номер квартиры: ");
        int n = sc.nextInt();
        int m = 4;
        int floor = 9 * m;
        int numEntrance = n / floor;
        if (numEntrance == 0 || n == floor)
            System.out.println("Первый подъезд");
        else if (numEntrance == 1 || n == 2 * floor)
            System.out.println("Второй подъезд");
        else if (numEntrance == 2 || n == 3 * floor)
            System.out.println("Третий подъезд");
        else if (numEntrance == 3 || n == 4 * floor)
            System.out.println("Четвёртый подъезд");
        else System.err.println("Вы ввели не допустимое значение!");
    }
}
