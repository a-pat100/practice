/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SearchInARotatedSortedArrayNonDistinct {
    public static void main(String[] args) {
        int[] arr = new int[] {
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1
        };
        System.out.println(Solution.search(arr, 2));

    }

    static class Solution {

        public static boolean search(int[] n, int x) {
            for (int i : n
            ) {
                if (i == x) return true;
            }
            return false;

        }
    }


}
