/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays.Matrix;

import Arrays.Commons;

public class RotateMetrix90Deg {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 0, 10, 11, 12 }, { 13, 14, 15, 0 }
        };
        System.out.println("Original array ------ ");
        Commons.Print2DArray(arr);
        System.out.println("Rotated Array --------");
        Solution.rotate(arr);
        Commons.Print2DArray(arr);

    }

    static class Solution {
        public static void rotate(int[][] n) {
            int l = n.length;
            int k;
            // mirror array digonally
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < i; j++) {
                    k = n[i][j];
                    n[i][j] = n[j][i];
                    n[j][i] = k;

                }
            }
            // mirror each subarray
            for (int i = 0; i < l; i++) {
                int startInclusive = 0;
                int endInclusive = l - 1;
                while (endInclusive > startInclusive) {
                    int k1 = n[i][startInclusive];
                    n[i][startInclusive] = n[i][endInclusive];
                    n[i][endInclusive] = k1;
                    endInclusive--;
                    startInclusive++;
                }
            }


        }
    }
}
