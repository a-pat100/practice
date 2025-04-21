/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class GCDandLCM {
    public static void main(String[] args) {

    }

    static class Solution {
        public static int[] lcmAndGcd(int a, int b) {
            int[] ans = new int[2];
            if (a > b) {
                ans[1] = gcd(a, b);
            }
            else {
                ans[1] = gcd(b, a);
            }
            ans[0] = (int) (((long) a * (long) b) / ans[1]);
            return ans;
        }

        static int gcd(int a, int b) {
            if (a % b == 0) return b;
            return gcd(b, a % b);
        }

    }
}
