/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(Solution.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println("completed");
    }

    static class Solution {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();

            Arrays.sort(nums);
            int small = 0;
            int large = nums.length - 1;
            for (int i = 1; i < nums.length - 1; i++) {
                // find if any pair of indexes satisfy 3 sum condition
                small = 0;
                large = nums.length - 1;
                while (small < i && large > i) {
                    if (nums[small] + nums[large] + nums[i] > 0) {
                        while (nums[large + 1] == nums[large - 1]) {
                            large--;
                        }
                    }
                    else if (nums[small] + nums[large] + nums[i] < 0) {
                        while (nums[small] == nums[small + 1]) {
                            small++;
                        }
                    }
                    else {
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[small]);
                        arr.add(nums[i]);
                        arr.add(nums[large]);
                        small++;
                        ans.add(arr);
                    }
                }


            }


            return ans;
        }
    }


}
