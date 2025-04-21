/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays.Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }


        };
        System.out.println("Traversed Array Is : ");
        System.out.println(Solution.spiralOrder(arr));


    }


    static class Solution {
        public static List<Integer> spiralOrder(int[][] m) {
            ArrayList<Integer> ans = new ArrayList<>();
            int l = m[0].length;
            int b = m.length;
            int i = 0;
            int j = 0;

            // each level with an of set of i  from the origin
            for (int k = 0; k <= (m.length - 1) / 2; k++) {
                i = k;
                j = k;
                // teaverse top row  - left to right
                // always add first element
                ans.add(m[i][j++]);
                while (j < l - 1 - k) {
                    ans.add(m[i][++j]);
                }
                while (i < b - k - 1) {
                    ans.add(m[++i][j]);
                }
                while (j > k) {
                    ans.add(m[i][--j]);
                }
                while (i > k) {
                    ans.add(m[--i][j]);
                }
            }
            return ans;
        }
    }
}
