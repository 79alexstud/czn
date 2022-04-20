package com.company;
//Game - Lets,s guess number

public class  Main {
    public static void main(String[] args) {
    Array arr = new Array();
    arr.Arr1();
        }
}





/*public class Main {
         public static void main () {
                Array Arr = new Array();
        }
}


import java.util.Scanner;
import java.util.Random;
public class  Main {

public static void main (String[] args) {
        int compNumber = random();
        for (int i = 0; i < 3; i++) {
                int humNumber = scan();
                if  (humNumber == compNumber) {
                        System.out.println ("Ты выиграл(а)");
                        i = 3;
                } else {
                       if (i != 2) {System.out.println("Попробуй еще раз, осталось попыток в кол-ве " + (2-i));}
                else {System.out.println("Ты проиграл(а)");}
                }
                }
        }

public static int random() {
        Random newRandom = new Random();
        int randoNumber = newRandom.nextInt(11) + 1;
        return randoNumber;
        }

public static int scan(){
        System.out.println("Угадай число от 1 до 10");
        Scanner scanner = new Scanner(System.in);
        int humanNumber = scanner.nextInt();
        return humanNumber;
        }
        }
*/