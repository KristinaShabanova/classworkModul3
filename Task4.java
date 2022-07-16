package com.company;

// Дана точка на плоскости заданная координатами x и y,
//определить и вывести в консоль, в какой четверти находится точка, в прямоугольной (декартовой) системе координат.
//Четверти обозначены римскими цифрами.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("input coordinate x, y");
        Scanner coordinate = new Scanner(System.in);
        System.out.print("coordinate x: ");
        int x = coordinate.nextInt();
        System.out.print("coordinate y: ");
        int y = coordinate.nextInt();

        if (x > 0 && y > 0)
            System.out.println("I");
        else if (x < 0 && y > 0)
            System.out.println("II");
        else if (x < 0 && y < 0)
            System.out.println("III");
        else if (x > 0 && y < 0)
            System.out.println("IV");
        else if (x == 0 && y < 0)
            System.out.println("III, IV");
        else if (x == 0 && y > 0)
            System.out.println("I, II");
        else if (x > 0 && y == 0)
            System.out.println("I, IV");
        else if (x < 0 && y == 0)
            System.out.println("II, III");
        else if (x == 0 && y == 0)
            System.out.println("I, II, III, IV");
    }
}
