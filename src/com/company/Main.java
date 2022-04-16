package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Введите первое число num");
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextInt();
        float a = 18;
        float div = a/num;
System.out.println("delenie = " + div);
}
}
