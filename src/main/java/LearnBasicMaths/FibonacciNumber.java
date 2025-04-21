/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class FibonacciNumber {
    public static void main(String[] args) {

    }

    static class Solution {
        int[] f;

        public int fib(int n) {
            f = new int[n + 1];
            f[1] = 1;
            return f(n);
        }

        public int f(int n) {
            if (n == 0 || n == 1) {
                return n;
            }
            if (f[n] != 0) {
                return f[n];
            }
            else {
                f[n - 2] = f(n - 2);
                f[n - 1] = f(n - 1);
                f[n] = f[n - 1] + f[n - 2];
                return f[n];
            }

        }
    }
}
