/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;

public class SortColours {
    public static void main(String[] args) {
        Arrays.stream(Solution.sortColors2(new int[] { 2, 0, 2, 1, 1, 0 }))
              .forEach(System.out::println);

    }

    static class Solution {
        public static int[] sortColors2(int[] nums) {

            // move 0's to start
            // zero points to first non zero element from the start
            int zero = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    int j = zero++;
                    int k = nums[i];
                    nums[i] = nums[j];
                    nums[j] = k;
                }
            }
            // moove all 2's to the end
            int two = nums.length - 1;
            for (int i = nums.length - 1; i >= zero; i--) {
                if (nums[i] == 2) {
                    int j = two--;
                    int k = nums[i];
                    nums[i] = nums[j];
                    nums[j] = k;
                }
            }
            return nums;

        }

        public static int[] sortColors(int[] nums) {
            int ones = 0;
            int twos = 0;
            for (int i : nums) {
                if (i == 1) {
                    ones++;
                }
                else if (i == 2) {
                    twos++;
                }
            }
            for (int i = 0; i < (nums.length - ones - twos); i++) {
                nums[i] = 0;
            }
            for (int i = (nums.length - ones - twos); i < (nums.length - twos); i++) {
                nums[i] = 1;
            }
            for (int i = (nums.length - twos); i < (nums.length); i++) {
                nums[i] = 2;
            }
            return nums;
        }


    }


}
