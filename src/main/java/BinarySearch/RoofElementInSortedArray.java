/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

import Arrays.Commons;

import java.util.Arrays;

public class RoofElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 36, 82, 88, 56, 21, 17, 73, 86 };

        Commons.print1DArray(Solution.getFloorAndCeil(37, arr));

    }

    static class Solution {
        public static int[] getFloorAndCeil(int x, int[] n) {
            // code here
            Arrays.sort(n);
            int[] ans = new int[] { -1, -1 };
            int mid;
            int start = 0;
            int end = n.length - 1;
            if (n[0] > x) {
                return new int[] { -1, n[0] };
            }
            if (n[n.length - 1] < x) {
                return new int[] { n[n.length - 1], -1 };
            }

            while (end > start) {
                mid = (start + end) / 2;
                if (n[mid] == x || n[end] == x) return new int[] { x, x };

                if (end == start + 1) {
                    return new int[] { n[start], n[end] };
                }

                if (n[mid] > x) {
                    end = mid;
                }
                else {
                    start = mid;
                }

            }

            return new int[] { n[start], n[end] };
        }


    }

}
