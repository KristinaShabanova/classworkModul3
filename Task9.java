package com.company;

import java.util.Scanner;

//Даны координаты начала и координаты конца отрезка.
//Если считать отрезок обозначением горки, то в одном случае он обозначает спуск, в другом – подъем. Определить и
//вывести на экран – спуск это или подъем, ровная дорога или
//вообще отвесная.
public class Task9 {
    public static void main(String[] args) {
        int x;
        int y;
        int x1;
        int y1;
        System.out.println("Введите координаты двух точек");
        Scanner sc = new Scanner(System.in);
        System.out.print("Координата x первой точки: ");
        x = sc.nextInt();
        System.out.print("Координата y первой точки: ");
        y = sc.nextInt();
        System.out.print("Координата x второй точки: ");
        x1 = sc.nextInt();
        System.out.print("Координата y второй точки: ");
        y1 = sc.nextInt();

        if ((x > x1 && y > y1) && (x != y && x1 != y1))
            System.out.println("Спуск");
        else if ((x < x1 && y < y1) && (x != y && x1 != y1))
            System.out.println("Подъем");
        else if ((x < x1 && y == y1) || (x > x1 && y == y1))
            System.out.println("Ровная дорога");
        else if (x == y || x1 == y1)
            System.out.println("Отвесная");
    }
}
