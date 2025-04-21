/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

        int[] arr = new int[] { 1, 1, 2 };
        System.out.println(Integer.MAX_VALUE);
        System.out.println("ans : " + Solution.removeDuplicatesOptimised(arr));
        Arrays.stream(arr).forEach(System.out::print);

    }


    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int duplicatesCount = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    duplicatesCount++;
                    nums[i - 1] = Integer.MAX_VALUE;
                }
            }
            Arrays.sort(nums);
            return nums.length - duplicatesCount;

        }

        public static int removeDuplicatesOptimised(int[] nums) {
            int doneTill = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != nums[doneTill]) {
                    doneTill++;
                    nums[doneTill] = nums[j];
                }
            }
            return doneTill + 1;
        }


    }


}
