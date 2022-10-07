package org.example;

import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемый бюджет на октябрь: ");
        int money= scanner.nextInt();
        double Day = Methods.culDay(money);
        double Balance = Methods.culBalance(money);
        System.out.println("Бюджет на 1 день: " + Day + " руб.");
        System.out.println("Бюджет на неделю: " + Balance + " руб.");
    }


}
