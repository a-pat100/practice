/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        var arr = new int[] { 1, 2, 3, 4, 5 };
        Solution solution = new Solution();
        solution.reverseArray(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    static class Solution {
        public void reverseArray(int arr[]) {
            // code here
            reverseArray(arr, 0, arr.length - 1);

        }

        public void reverseArray(int arr[], int i, int j) {
            // code here
            if (i == j || i > j) {
                return;
            }
            else {
                int j_pos = arr[j];
                arr[j] = arr[i];
                arr[i] = j_pos;
                reverseArray(arr, i + 1, j - 1);
            }


        }

    }

}
