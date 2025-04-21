/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class TotalOfDevisors {
    public static void main(String[] args) {
        System.out.println(
                Solution.sumOfDivisors(100));

    }

    static class Solution {
        public static int sumOfDivisorOfN(int n) {
            // code here
            int ans = 0;
            int k = 1;
            int sqn = (int) Math.pow(n, 0.5);
            while (k <= sqn) {
                if (n % k == 0) {
                    ans += k;
                    ans += (n / k);
                }
                k++;
            }
            if (sqn * sqn == n) ans -= sqn;
            return ans;
        }

        public static int sumOfDivisors(int n) {
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += sumOfDivisorOfN(i);
            }
            return ans;
        }
    }
}
