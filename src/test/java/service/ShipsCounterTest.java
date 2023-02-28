package service;


import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShipsCounterTest {
    private static final Map<int[][], Integer> data = new HashMap<>();

    @BeforeClass
    public static void beforeClass() {
        data.put(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 1, 0, 0},
                {1, 1, 0, 0, 0, 0, 0, 0, 0, 1}
        }, 15);
        data.put(new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        }, 0);
        data.put(new int[][]{
                {1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 1}
        }, 14);
        data.put(new int[][]{
                {0, 0, 1, 1, 1, 0, 0, 1, 0, 0},
                {1, 1, 1, 1, 0, 0, 0, 0, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
        }, 16);
    }

    @Test
    public void countShips_OkInput() {
        for (Map.Entry<int[][], Integer> entry : data.entrySet()) {
            int[][] input = entry.getKey();
            int expected = entry.getValue();
            int actual = ShipsCounter.countShips(input);
            Assert.assertEquals(expected, actual);
        }
    }

    @Test(expected = RuntimeException.class)
    public void countShips_NotOkInput() {
        for (Map.Entry<int[][], Integer> entry : data.entrySet()) {
            int[][] input = {
                    {0, 0, 1, 1, 1, 0, 0, 1, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 0, 1, 1},
                    {1, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                    {0, 0, 1, 1, 1, 1, 0, 0, 0, 0},
                    {1, 0, 5, 0, 0, 0, 1, 1, 0, 0},
                    {0, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                    {1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 1, 1}
            };
            ShipsCounter.countShips(input);
        }
    }
}
