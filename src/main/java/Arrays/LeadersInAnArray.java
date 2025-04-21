/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        System.out.println(Solution.leaders(new int[] { 5, 10, 20, 40 }));

    }

    static class Solution {
        static ArrayList<Integer> leaders(int n[]) {
            // code here
            int maxYet = n[n.length - 1];
            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(maxYet);
            for (int i = n.length - 2; i > -1; i--) {
                if (n[i] >= maxYet) {
                    maxYet = n[i];
                    ans.add(maxYet);
                }
            }
            int i = 0;
            int j = ans.size() - 1;
            int k;
            while (i < j) {
                k = ans.get(i);
                ans.set(i++, ans.get(j));
                ans.set(j--, k);
            }
            return ans;
        }
    }
}
