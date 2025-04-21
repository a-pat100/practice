/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(Solution.majorityElement(new int[] { 6, 5, 5 }));
    }


    // More's Voting Algorithm
    static class Solution {
        public static int majorityElement(int[] a) {
            int element = 0;
            int count = 0;
            for (int i : a) {
                if (count == 0) {
                    element = i;
                    count++;
                }
                else if (i == element) count++;
                else count--;
            }
            return element;
        }
    }

}
