/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 3 };
        System.out.println(Solution.singleNonDuplicate(arr));

    }

    static class Solution {
        public static int singleNonDuplicate(int[] n) {
            int start = 0;
            int end = n.length - 1;
            int mid;
            while (end >= start) {
                mid = (start + end) / 2;
                if (start == end) break;
                if (valid(n, mid)) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
            return n[end];

        }

        public static boolean valid(int[] n, int position) {
            if (position % 2 == 0) {
                return (position + 1 < n.length && n[position] == n[position + 1]);
            }
            else {
                return (position > 0 && n[position] == n[position - 1]);
            }
        }
    }
}
