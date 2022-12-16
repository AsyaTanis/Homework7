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

    public static void task1() {
        System.out.println("Задача 1");
        int totalSaving = 0;
        int contribution = 15000;
        int month = 0;
        while (totalSaving <= 2459000) {
            totalSaving = totalSaving + contribution;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        int number;
        number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }
        System.out.println();
        for (number = 10; number >= 1; number = number - 1) {
            System.out.print(number + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate;
        int mortalityRate;
        int naturalGrowth;
        int year = 2022;
        while (year <= 2032) {
            birthRate = (population / 1000) * 17;
            mortalityRate = (population / 1000) * 8;
            naturalGrowth = birthRate - mortalityRate;
            population = population + naturalGrowth;
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет " + population + " миллионов человек.");
        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        float deposit = 15000f;
        int month = 0;
        while (deposit <= 12000000f) {
            deposit += deposit * 0.07;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма вклада равна " + deposit + " рублей");
        }
        System.out.println("Всего потребуется " + month + " месяцев");
    }

    public static void task5() {
        System.out.println();
        System.out.println("Задача 5");
        float deposit = 15000f;
        int month = 0;
        while (deposit <= 12000000f) {
            deposit += deposit * 0.07;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма вклада равна " + deposit + " рублей");
            }
        }
        System.out.println("Всего потребуется " + month + " месяцев");
    }


    public static void task6() {
        System.out.println();
        System.out.println("Задача 6");
        float deposit = 15000f;
        int month = 0;
        while (month <= 9 * 12) {
            deposit += deposit * 0.07;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма вклада равна " + deposit + " рублей");
            }
        }
        System.out.println("Всего накоплено за 9 лет(108 месяцев): " + deposit);
    }

    public static void task7() {
        System.out.println();
        System.out.println("Задача 7");
        int firstFriday = 6;
        for (int friday = firstFriday; friday <= 31; friday += 1) {
            if ((friday - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void task8() {
        System.out.println();
        System.out.println("Задача 8");
        int cometYear;
        int lowerLimit = 2022 - 200;
        int upperLimit = 2022 + 100;

        for (cometYear = 0; cometYear <= upperLimit; cometYear += 79) {
            if (cometYear >= lowerLimit) {
                System.out.println(cometYear);
            }
        }
    }
}