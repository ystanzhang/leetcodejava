/**
 * Created by stan.zhang on 7/19/17.
 */
import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; ++i) {
            int num = target - numbers[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(numbers[i], i);
        }
        throw new IllegalArgumentException("NO two sum solution");
    }
}
