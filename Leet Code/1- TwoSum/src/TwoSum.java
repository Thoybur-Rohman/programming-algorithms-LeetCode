import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int [] numbs = {2,7,11,15};
        //twoSum1(numbs,9);
       // twoSum2(numbs,9);
        twoSum3(numbs,9);
    }

    //Solution 1
    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.print("hi");
                    return new int[] { i, j };

                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
            //Solution 2
            public static int[] twoSum3(int[] nums, int target) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                    int sum = target - nums[i];
                    if (map.containsKey(sum)) {

                        // this gets the key value
                        return new int[] { map.get(sum), i };

                    }
                    map.put(nums[i] ,i);

                }
                // In case there is no solution, we'll just return null

                return null;
            }
        }


