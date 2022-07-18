package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int firstFridayMonth = 1;
        int maxDateInMonth = 31;
        int daysPerWeek = 7;

        for (int currentDate = firstFridayMonth; currentDate <= maxDateInMonth; currentDate++) {
            if ((currentDate-firstFridayMonth) % daysPerWeek == 0) {
                System.out.println("Сегодня пятница, " + currentDate + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int finishPeriod = currentYear + 100;

        for (int i = 0; i <= finishPeriod; i++) {
            if (i >= startPeriod && i % 79 == 0) {
                System.out.println(i);
            }
        }

        System.out.println();
    }
}
