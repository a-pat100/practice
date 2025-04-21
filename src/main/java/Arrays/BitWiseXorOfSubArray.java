/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.HashMap;

public class BitWiseXorOfSubArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 4, 2, 2, 6, 4 };
        System.out.println(Solution.solve(arr, 6));
    }

    static public class Solution {
        public static int solve(int[] A, int B) {
            int ans = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            int initial = 0;
            map.put(B, 1);
            for (int i = 0; i < A.length; i++) {
                initial = initial ^ A[i];
                int temp = initial ^ B;
                if (map.containsKey(initial)) {
                    ans += map.get(initial);
                }
                map.put(temp, map.getOrDefault(temp, 0) + 1);
            }


            return ans;
        }
    }
}
