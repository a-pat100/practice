/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.HashMap;

public class SubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, -1, 0 };
        System.out.println(Solution.subarraySum(arr, 0));

    }

    static class Solution {
        public static int subarraySum(int[] nums, int k) {
            int ans = 0;
            HashMap<Integer, Integer> sums = new HashMap<>();
            int sum = 0;
            sums.put(sum, 1);
            for (int i : nums
            ) {
                sum += i;
                // if (sums.containsKey(sum - k)) {
                //     ans += sums.get(sum - k);
                // }
                ans += sums.getOrDefault(sum - k, 0);
                sums.put(sum, sums.getOrDefault(sum, 1) + 1);
            }
            return ans;
        }
    }

}
