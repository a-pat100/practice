/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class CountInversion {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 1, 1 };
        System.out.println(Solution.inversionCount(arr));
        Commons.print1DArray(arr);

    }

    static class Solution {
        static int ans = 0;

        // Function to count inversions in the array.
        static int inversionCount(int arr[]) {
            // Your Code Here
            ans = 0;
            MergeSort(new int[arr.length], arr, 0, arr.length - 1);
            return ans;
        }

        private static void MergeSort(int[] buffer, int[] arr, int start, int end) {
            if (start == end) return;
            int mid = (start + end) / 2;
            MergeSort(buffer, arr, start, mid);
            MergeSort(buffer, arr, mid + 1, end);
            merge(buffer, arr, start, mid, end);

        }

        private static void merge(int[] buffer, int[] arr, int start, int mid, int end) {
            int i;
            for (i = start; i <= end; i++) {
                buffer[i] = arr[i];
            }
            int x = start;
            int y = mid + 1;
            for (i = start; i <= end; i++) {
                if ((y > end) || (x <= mid && buffer[x] <= buffer[y])) {
                    arr[i] = buffer[x++];
                }
                else {
                    arr[i] = buffer[y++];
                    ans += (y - 1 - i);
                }

            }


        }


    }
}
