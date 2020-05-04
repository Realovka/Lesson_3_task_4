package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество сенокосилок");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Введите количество количество часов, которое работала первая сенокосилка");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int sum = 0;
        m *= 60; // перевод часов в минуты
        for (int i = 1; i <= n; i++) {
            sum +=m;
            m += 10;
        }
        System.out.println(sum / 60); // перевод в часы
    }
}
