/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {

        System.out.println(Solution.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));

    }

    static class Solution {


        public static int longestConsecutive(int[] n) {

            HashSet<Integer> map = new HashSet<>();
            int greatestSeqLength = 1;

            for (int i : n
            ) {
                if (map.contains(i)) {
                    continue;
                }
                map.add(i);

            }
            for (int i : n) {
                if (!map.contains(i)) continue;
                int count = 1;
                int k = i;
                // dig lower
                while (map.contains(--k)) {
                    count++;
                    map.remove(k);
                }
                k = i;
                while (map.contains(++k)) {
                    count++;
                    map.remove(k);
                }
                greatestSeqLength = count > greatestSeqLength ? count : greatestSeqLength;
            }
            return greatestSeqLength;

        }


    }
}
