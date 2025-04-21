/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;

public class RightRotateKPosistions {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        Solution.rotateOptimised(arr, 3);
        Arrays.stream(arr).forEach(System.out::print);

    }

    static class Solution {
        public static void rotate(int[] nums, int k) {
            for (int i = 0; i < k; i++) {
                rotate(nums);
            }
        }

        public static void rotate(int[] nums) {
            int last = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
        }

        public static void rotateOptimised(int[] arr, int k) {
            int n = arr.length;
            k = k % n;
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);

        }

        private static void reverse(int[] arr, int i, int j) {
            while (j > i) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                j--;
                i++;
            }
        }
    }
}
