/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(Solution.generate(5));

    }

    static class Solution {
        public static List<List<Integer>> generate(int numRows) {
            List<List<Integer>> ans = new ArrayList<>();

            ArrayList<Integer> arr1 = new ArrayList<>();
            arr1.add(1);
            ans.add(arr1);
            for (int i = 2; i <= numRows; i++) {
                ArrayList<Integer> arr = new ArrayList<>();
                int k = i / 2;
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) arr.add(1);
                    else {
                        arr.add(ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j));
                    }

                }
                ans.add(arr);
            }
            return ans;
        }
    }
}
