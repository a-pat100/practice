/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LengthOfBiggestSubArrayWithKSum {
    public static void main(String[] args) {
        int[] arr = new int[] { -1, 2, -3 };
        int k = -2;
        System.out.println(Solution.lenOfLongestSubarr(arr, k));

    }

    static class Solution {
        public static int lenOfLongestSubarr(int[] arr, int k) {
            // code here
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(0, -1);
            int currentSum = 0;
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {
                currentSum += arr[i];
                if (map.get(currentSum) == null) {
                    map.put(currentSum, i);
                }
                if (map.get(currentSum - k) != null) {
                    ans = Math.max(i - map.get(currentSum - k), ans);
                }
            }
            return ans;
        }
    }


}
