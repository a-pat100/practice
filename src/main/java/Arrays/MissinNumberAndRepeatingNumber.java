/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;

public class MissinNumberAndRepeatingNumber {
    public static void main(String[] args) {
        int nums[] = new int[] { 4, 3, 6, 2, 1, 1 };
        System.out.println(Solution.findTwoElement(nums));

    }

    static class Solution {
        // Function to find two elements in array
        static ArrayList<Integer> findTwoElement(int nums[]) {

            // code here
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i + 1) {
                    if (nums[nums[i] - 1] == nums[i]) {
                        if (ans.isEmpty()) {
                            ans.add(nums[i]);
                        }
                        break;
                    }
                    int k = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = k;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != i + 1) {
                    ans.add(i + 1);
                    break;
                }
            }

            return ans;

        }
    }


}
