/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import static Arrays.Commons.print1DArray;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 1, -2, -5, 2, -4 };
        print1DArray(arr);

    }


    static class Solution {
        static void exchange(int[] arr, int i, int j) {
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
        }

        public static int[] rearrangeArray(int[] nums) {

            int positive = 0;
            int negative = 1;
            int[] ans = new int[nums.length];

            for (int i : nums
            ) {
                if (i < 0) {
                    ans[negative] = i;
                    negative += 2;
                }
                else {
                    ans[positive] = i;
                    positive += 2;
                }
            }
            return ans;
        }

    }
}
