package in.gmbilabs.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void positiveTest1() {
        int [] arr = {8, 5, 10, 100, 10, 5};

        int maxCheeseInKg = Solution.maxCheeseInKg(arr);
        Assertions.assertEquals(113, maxCheeseInKg);
    }

    @Test
    public void positiveTest2() {
        int [] arr = {8};
        int maxCheeseInKg = Solution.maxCheeseInKg(arr);

        Assertions.assertEquals(8, maxCheeseInKg);
    }
}
