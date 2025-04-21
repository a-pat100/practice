/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SearchIn2dMatrix {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int[] arr : matrix) {
                if (searchMatrix(matrix, target)) {
                    return true;
                }
            }
            return false;
        }

        public boolean searchMatrix(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            int mid;
            while (end >= start) {
                mid = (start + end) / 2;
                if (arr[mid] == target) return true;
                else if (arr[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return false;
        }


    }
}
