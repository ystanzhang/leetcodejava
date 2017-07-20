import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by stan.zhang on 7/20/17.
 */
class TwoSumTest {
    TwoSum sol = new TwoSum();
    @Test
    void twoSum() {
        int[] numbers = {0,1,1,4,5};
        int target = 1;
        int[] ret = new int[2];
        ret = sol.twoSum(numbers, target);
        System.out.println(ret[0] + " " + ret[1] );
    }



}