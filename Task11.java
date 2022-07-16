package com.company;

import java.util.Scanner;

/* Найти корни квадратного уравнения и вывести их на
экран, если они есть. Если корней нет, то вывести сообщение об этом. Конкретное квадратное уравнение определяется
коэффициентами a, b, c, которые вводит пользователь с
клавиатуры. */
public class Task11 {
    public static void main(String[] args) {
        System.out.println("ax2 + bx + c = 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите коэффициент а: ");
        float a = sc.nextFloat();
        System.out.print("Введите коэффициент b: ");
        float b = sc.nextFloat();
        System.out.print("Введите коэффициент c: ");
        float c = sc.nextFloat();
        float discriminant = (float) (Math.pow(b,2) - 4 * a * c);
        float x;
        float x1;
        if (discriminant > 0){
            x = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
            x1 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.printf("Первый корень: %.2f\nВторой корень: %.2f", x,x1);;
        }
        else if (discriminant == 0){
            x = (float) (-b / (2 * a));
            System.out.print("Корень: " + x);
        }
        else System.err.println("Корней нет");
    }
}
