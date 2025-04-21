/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 5 };
        System.out.println(Solution.searchInsert(arr, 4));

    }

    static class Solution {
        public static int searchInsert(int[] n, int x) {
            if (n[0] > x) return 0;
            if (n[n.length - 1] < x) return n.length;

            int start = 0;
            int end = n.length - 1;
            int mid;
            while (start <= end) {
                mid = (start + end) / 2;
                if (n[mid] == x) return mid;
                if (mid == start) {
                    if (n[start] < x) {
                        return end;
                    }
                    else return start;

                }
                else if (n[mid] < x) {
                    start = mid + 1;
                }
                else {
                    end = mid;
                }
            }
            return 0;
        }
    }


}
