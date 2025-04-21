/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.HashMap;

public class LargestSubArrayWith0Sum {
    public static void main(String[] args) {
        int[] n = new int[] { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(Solution.maxLen(n));


    }

    static class Solution {
        static int maxLen(int n[]) {
            // code here

            HashMap<Integer, Integer> map = new HashMap<>();
            int maxLength = 0;
            int sum = 0;
            map.put(0, -1);
            Integer index;
            for (int i = 0; i < n.length; i++) {
                sum += n[i];
                index = map.get(sum);
                if (index == null) {
                    map.put(sum, i);
                }
                else {
                    maxLength = maxLength > i - index ? maxLength : i - index;
                }
            }
            return maxLength;

        }
    }
}
