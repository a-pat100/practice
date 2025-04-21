/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] {
                3, -1, 4
        };
        System.out.println(Solution.maxProduct(arr));

    }

    static class Solution {
        public static int maxProduct(int[] nums) {
            int maximumProduct = nums[0];
            int pos = 1;
            int neg = 1;

            for (int i = 0; i < nums.length; i++
            ) {
                if (neg == 0) neg = 1;
                if (pos <= 0) pos = 1;
                int k = nums[i];
                if (k > 0) {
                    neg *= k;
                    pos *= k;
                }
                else {
                    if (neg > 0) {
                        neg *= k;
                        pos *= k;
                    }
                    else {
                        int x = neg;
                        neg = pos * k;
                        pos = x * k;
                    }
                }
                maximumProduct = Math.max(Math.max(neg, pos), maximumProduct);
            }
            return maximumProduct;


        }
    }
}
