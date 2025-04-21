/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] {
                4, 5, 6, 7, 0, 1, 2
        };
        System.out.println(Solution.search(arr, 2));

    }

    static class Solution {

        public static int search(int[] n, int x) {
            int start = 0;
            int end = n.length - 1;
            int mid;
            while (end >= start) {
                mid = (start + end) / 2;
                if (x == n[mid]) {
                    return mid;
                }
                if (n[mid] > n[end]) {
                    if (x < n[mid]) {
                        if (x <= n[end]) {
                            start = mid + 1;
                        }
                        else {
                            end = mid - 1;
                        }
                    }
                    else {
                        start = mid + 1;
                    }
                }
                else {
                    if (x > n[mid]) {
                        if (x <= n[end]) {
                            start = mid + 1;
                        }
                        else {
                            end = mid - 1;
                        }
                    }
                    else {
                        end = mid - 1;
                    }
                }

            }
            return -1;

        }
    }


}
