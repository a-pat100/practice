/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class FindRowWithMax1s {
    public static void main(String[] args) {
        System.out.println(Solution.noOf1s(new int[] { 0, 0, 0, 1, 1, 1, 1 }));
    }

    static class Solution {
        public int rowWithMax1s(int arr[][]) {
            // code here
            int ans = -1;
            int count = 0;
            int counter = 0;
            for (int[] arr1 : arr) {
                counter++;
                int k = noOf1s(arr1);
                if (k > count) {
                    count = k;
                    ans = counter;
                }
            }
            return ans;
        }

        static int noOf1s(int[] arr) {
            int n = arr.length;
            int start = 0;
            int end = n - 1;
            int mid;
            while (end >= start) {
                mid = (start + end) / 2;
                if (arr[mid] == 1) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return n - start;
        }
    }
}
