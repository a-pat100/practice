/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

import Arrays.Commons;

public class FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 7, 7, 8, 8, 10 };
        Commons.print1DArray(Solution.searchRange(arr, 6));

    }

    static class Solution {
        public static int[] searchRange(int[] n, int target) {
            // search for starting
            int start = 0;
            int end = n.length - 1;
            int mid;
            int x = -1;
            while (end >= start) {
                mid = (start + end) / 2;
                if (start == end) {
                    if (n[start] == target) {
                        x = start;
                        break;
                    }
                    else return new int[] { -1, -1 };
                }
                else if (n[mid] < target) {
                    start = mid + 1;
                }
                else if (n[mid] == target) {
                    end = mid;
                }
                else {
                    end = mid - 1;
                }
            }
            int y = -1;
            start = x;
            end = n.length - 1;
            while (end >= start) {
                mid = (start + end + 1) / 2;
                if (start == end) {
                    y = start;
                    break;
                }
                else if (n[mid] > target) {
                    end = mid - 1;
                }
                else if (n[mid] == target) {
                    start = mid;
                }
                else {
                    start = mid + 1;
                }
            }
            return new int[] { x, y };
        }
    }


}
