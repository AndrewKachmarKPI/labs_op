package com.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = scanner.nextInt(); //Введення значення a з консолі

        System.out.print("Enter x:");
        double x = scanner.nextDouble(); //Введення значення x з консолі
        if (x > 1 || x < -1) { //Перевірка умови параметра x
            System.out.println("Invalid x parameter");
            scanner.close();
            System.exit(0);
        }
        scanner.close();

        double totalSum = 0; //створення та ініціалізація змінних
        int k = 1; //створення та ініціалізація змінних
        double eps = Math.pow(10, -5); //створення та ініціалізація змінних

        double primarySum; //створення та ініціалізація змінних

        do {
            primarySum = (a - k + 1) * Math.pow(x, k) / findFactorialOfNumber(k); //обрахування проміжного значення суми
            System.out.print("Sum = "); //виведення проміжної суми
            System.out.printf("%.5f%n", primarySum); //виведення проміжної суми
            totalSum = totalSum + primarySum; //додавання проміжної суми до загальної суми
            k++;

        } while (Math.abs(primarySum) >= eps); //умова циклу

        totalSum += 1; //збільшення значеня загальної суми по умові задачі на 1
        System.out.print("Total sum = "); //виведення загальної суми
        System.out.printf("%.5f%n", totalSum); //виведення загальної суми
    }

    /**
     * Метод для знаходження факторіалу введеного числа
     *
     * @param number число для якого потрібно знайти факторіал
     * @return факторіал числа
     */
    public static int findFactorialOfNumber(int number) {
        int fact = 1; //створення та ініціалізація змінних
        for (int i = 1; i < number + 1; i++) { //створення циклу
            fact = fact * i; //знаходження факторіалу
        }
        return fact;
    }
}
