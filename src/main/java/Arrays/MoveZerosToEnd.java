/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0 };
        Solution.moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }


    static class Solution {
        public static void moveZeroes(int[] nums) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == 0) continue;
                if (i != j) {
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                i++;
            }

        }
    }


}
