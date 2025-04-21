/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class BinarySearchOn1DArray {
    public static void main(String[] args) {

    }

    class Solution {
        public int search(int[] nums, int target) {
            // searching recursively
            int start = 0;
            int end = nums.length - 1;
            return search(nums, target, start, end);
        }

        private int search(int[] nums, int target, int start, int end) {
            if (end < start) return -1;
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                search(nums, target, start, mid - 1);
            }
            else {
                search(nums, target, start, mid - 1);
            }

            return target;
        }

        private int searchIterative(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            int mid;
            while (end > start) {
                mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                else if (nums[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return -1;
        }


    }


}
