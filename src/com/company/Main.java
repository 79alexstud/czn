package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();
        System.out.print("Введите третье число: ");
        int c = scan.nextInt();
        System.out.println("Сумма чисел = " + (a + b + c));
    }
}
