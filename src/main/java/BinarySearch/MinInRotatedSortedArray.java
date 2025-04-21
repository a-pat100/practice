/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class MinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = new int[] {
                11, 13, 15, 17
        };
        System.out.println(Solution.findMin(a));

    }

    static class Solution {
        public static int findMin(int[] nums) {
            return nums[(findPivot(nums) + 1) % (nums.length)];

        }

        private static int findPivot(int[] n) {
            int start = 0;
            int end = n.length - 1;
            int mid;
            while (start < n.length - 1 && end >= start) {
                mid = (start + end) / 2;
                if (n[end] > n[start]) return end;
                if (n[mid] > n[mid + 1]) return mid;

                if (n[mid] > n[start]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            return end;
        }
    }
}
