/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementsNBY3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 2, 1, 3 };
        System.out.println(Solution.majorityElement(arr));

    }

    static class Solution {
        public static List<Integer> majorityElement(int[] nums) {
            List<Integer> ans = new ArrayList<>();


            int count1 = 0;
            int count2 = 0;
            int candidate1 = 0;
            int candidate2 = 0;


            for (int i : nums
            ) {
                if (count1 == 0 && i != candidate2) {
                    count1 = 1;
                    candidate1 = i;
                }
                else if (count2 == 0 && i != candidate1) {
                    count2 = 1;
                    candidate2 = i;
                }
                else if (candidate1 == i) {
                    count1++;
                }
                else if (candidate2 == i) {
                    count2++;
                }
                else {
                    count1--;
                    count2--;
                }


            }
            count1 = 0;
            count2 = 0;
            for (int i : nums
            ) {
                if (i == candidate1) count1++;
                else if (i == candidate2) {
                    count2++;
                }
            }


            if (count1 > nums.length / 3) {
                ans.add(candidate1);
            }
            if (count2 > nums.length / 3) {
                ans.add(candidate2);
            }
            return ans;
        }


    }
}
