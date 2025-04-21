/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class ReversePairs {
    public static void main(String[] args) {

        int[] arr = new int[] {
                2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647
        };
        System.out.println(Solution.reversePairs(arr));
        Commons.print1DArray(arr);
    }

    static class Solution {
        static int ans = 0;

        public static int reversePairs(int[] arr) {

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
            int x = mid;
            int y = end;
            count(arr, start, mid, end);
            for (i = end; i >= start; i--) {
                if ((y <= mid) || (x >= start && buffer[x] >= buffer[y])) {
                    arr[i] = buffer[x--];
                }
                else {
                    arr[i] = buffer[y--];
                }
            }
        }

        private static void count(int[] arr, int start, int mid, int end) {
            int marker = mid;
            for (int i = end; i > mid; i--) {
                while (marker >= start && (arr[marker] > (2 * (long) arr[i]))) {
                    marker--;
                }
                ans += mid - marker;
            }
        }
    }
}
