/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {

    }


    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int i = 0;
            int j = 0;
            // find  last large element ehich will go into end of arr1

            while (i + j < m) {
                if (nums1[i] <= nums2[j]) {
                    i++;
                }
                else {
                    j++;
                }
            }
            int pivot = Math.min(nums1[i], nums2[j]);

            i = 0;
            j = 0;
            while (i < m && j < n) {
                if (nums1[i + 1] > nums2[j]) {
                    int temp = nums1[i + 1];
                    nums1[i + 1] = nums2[j];
                    nums2[j] = temp;
                    i++;
                }
            }


        }
    }
}
