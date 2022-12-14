public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("Задача 1");

        int saving = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000){
            month++;
            total = total + saving;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
    }
    public static void task2(){
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i+ " ");
        }
        System.out.println();
        for ( int q = 10; q >= 1; q--){
            System.out.print(q+ " ");
        }
        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");

        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        for (int i = 1; i <= 10; i++) {
            population += population * dif / 1000;
            System.out.println("Год " + i + " численность населения состовляет " + population);
        }
        // Решение через WHILE
         /*int population = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 0;
        while (year<10){
            int ratio = population / 1000;
            int deathPerYear = death * ratio;
            int bornPerYear = born * ratio;
            population = population + bornPerYear - deathPerYear;
            year++;
            System.out.println("Год " + year + " численность населения состовляет " + population);
        }*/

    }
    public static void task4(){
        System.out.println("Задача 4");

        int percent = 7;
        int initialAmount = 15_000;
        int month = 0;
        while (initialAmount <= 12_000_000){
            int initialAmountPerMonth = (initialAmount / 100) * percent;
            initialAmount = initialAmount + initialAmountPerMonth;
            month++;
            System.out.println("Месяцев " + month + ", полученная сумма " + initialAmount);
        }
    }
    public static void task5(){
        System.out.println("Задача 5");

        int percent = 7;
        int initialAmount = 15_000;
        int month = 0;
        while (initialAmount < 12_000_000){
            int initialAmountPerMonth = (initialAmount / 100) * percent;
            initialAmount = initialAmount + initialAmountPerMonth;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяцев " + month + ", полученная сумма " + initialAmount);
            }
        }
    }
    public static void task6(){
        System.out.println("Задача 6");

        int percent = 7;
        int initialAmount = 15_000;
        int month = 0;
        int year = 9;
        int duration = year * 12;
        while (month <= duration){
            int initialAmountPerMonth = (initialAmount / 100) * percent;
            initialAmount = initialAmountPerMonth + initialAmount;
            month++;
            if (month % 6 == 0){
                System.out.println("Полгода " + month + " месяц, полученная сумма " + initialAmount);
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int friday = 3;
        for (; friday <=31; friday = friday + 7){
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

    }
    public static void task8(){
        System.out.println("Задача 8");

        int year = 1888;
        for (;year<=2111; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}