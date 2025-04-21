/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class FloorElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 5 };

        System.out.println(Solution.findFloor(arr, 4));

    }

    static class Solution {

        static int findFloor(int[] n, int target) {

            if (n[0] > target) return -1;
            // write code here
            int start = 0;
            int end = n.length - 1;
            int mid = (start + end) / 2;
            while (end > start) {
                mid = (start + end) / 2;

                if (mid == start) {
                    if (n[end] > target) return start;
                    else return end;
                }
                if (n[mid] == target) return mid;
                if (n[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid;
                }


            }
            return end;
        }
    }

}
