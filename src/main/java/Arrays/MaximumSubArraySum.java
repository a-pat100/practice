/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        System.out.println(Solution.maxSubArray(new int[] { 5, 4, -1, 7, 8 }));

    }

    // KADANE'S Algorithm

    static class Solution {
        public static int maxSubArray(int[] nums) {
            int maxYet = Integer.MIN_VALUE;
            int sum = 0;
            for (int n : nums) {
                sum += n;
                maxYet = sum > maxYet ? sum : maxYet;
                sum = sum < 0 ? 0 : sum;
            }
            return maxYet;

        }
    }
}
