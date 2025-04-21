/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ans = Solution.twoSumOptimised(new int[] { 3, 2, 4 }, 6);
        Arrays.stream(ans).forEach(System.out::println);

    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            // next index
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length - 1; i++) {
                map.put(nums[i], i);
                Integer k = map.get(target - nums[i]);
                if (k != null) {
                    return new int[] { k, i };
                }
            }
            return new int[] { };
        }

        public static int[] twoSumOptimised(int[] nums, int target) {
            // next index
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            Arrays.sort(nums);
            int i = 0;
            int j = nums.length - 1;
            int sum = 0;
            while (i < j) {
                sum = nums[i] + nums[j];
                if (sum < target) {
                    i++;
                }
                else if (sum > target) {
                    j--;
                }
                else {
                    int a = map.get(nums[i]);
                    int b = map.get(nums[j]);
                    if (a < b) {
                        return new int[] { a, b };
                    }
                    else {
                        return new int[] { b, a };
                    }
                }
            }
            return new int[] { };
        }

    }
}
