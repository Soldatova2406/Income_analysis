import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] AllMonth = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void sumMonthTest(){
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumSales(AllMonth);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void averageSumSalesTest(){
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.averageSumSales(AllMonth);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void minSalesTest(){
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(AllMonth);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void maxSalesTest(){
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(AllMonth);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void lessAverageMonthTest(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.lessAverageSumSales(AllMonth);
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void moreAverageMonthTest(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.moreAverageSumSales(AllMonth);
        Assertions.assertEquals(expected,actual);

    }

}
