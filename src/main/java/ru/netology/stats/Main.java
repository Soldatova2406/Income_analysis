package ru.netology.stats;

import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] AllMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumSales = service.sumSales(AllMonth);
        System.out.println("Сумма всех продаж: " + sumSales);

        int averageSumSales = service.averageSumSales(AllMonth);
        System.out.println("Среднее значение по продажам: " + averageSumSales);

        int minMonth = service.minSales(AllMonth);
        System.out.println("Номер месяца с минимальными продажами: " + minMonth);

        int maxMonth = service.maxSales(AllMonth);
        System.out.println("Номер месяца с максимальными продажами: " + maxMonth);

        int lessAverageSumSales = service.lessAverageSumSales(AllMonth);
        System.out.println("Количество месяцев с продажами мешьше среднего: " + lessAverageSumSales);

        int moreAverageSumSales = service.moreAverageSumSales(AllMonth);
        System.out.println("Количество месяцев с продажами больше среднего: " + moreAverageSumSales);

    }
}