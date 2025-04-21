/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class NthRoot {
    public static void main(String[] args) {
        for (int j = 2; j < 100; j++) {
            int i = j * j * j;
            int k = Solution.nthRoot(3, i);
            int expected = (int) Math.pow(k, 3);
            if (i != expected) {
                System.out.printf("NOT WORKING FOR: %d , returned %d , returned ans's cube is %d  ",
                                  i, k, expected);
                System.out.println("");

            }
        }

    }

    static
    class Solution {
        public static int nthRoot(int n, int m) {
            // code here
            int k = nthRoot(1, n, n, m);
            if (nthPowerOfM(n, k) == m) return k;
            System.out.println(k);
            return -1;
        }

        public static int nthRoot(int s, int e, int n, int m) {
            // code here
            int mid = s + (e - s) / 2;
            int k = nthPowerOfM(n, mid);
            if (k == m || mid == s) return mid;
            else if (k > n) {
                return nthRoot(s, mid, n, m);
            }
            else {
                return nthRoot(mid, e, n, m);
            }
        }

        public static int nthPowerOfM(int n, int m) {
            int ans = 1;
            for (int i = 0; i < n; i++) {
                ans *= m;
            }
            return ans;
        }

    }
}
