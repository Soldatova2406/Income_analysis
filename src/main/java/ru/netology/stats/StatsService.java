package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return (int) sum;
    }

    public int averageSumSales(long[] sales) {
        long sum = 0;
        int a = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            a = i + 1;
        }
        return (int) sum / a;
    }

    public int lessAverageSumSales(long[] sales) {
        long sum = 0;
        int a = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            a = i + 1;
        }
        int avarage = (int) sum / a;
        int lessCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avarage) {
                lessCount++;
            }
        }
        return lessCount;
    }

    public int moreAverageSumSales(long[] sales) {
        long sum = 0;
        int a = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            a = i + 1;
        }
        int avarage = (int) sum / a;
        int moreCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avarage) {
                moreCount++;
            }
        }
        return moreCount;
    }

}

