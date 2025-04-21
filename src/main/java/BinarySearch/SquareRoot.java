/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        for (int i = 13; i < 100; i++) {
            int k = Solution.floorSqrt(i);
            int expected = (int) Math.pow(i, 0.5);
            if (k != expected) {
                System.out.printf("NOT WORKING FOR: %d , returned %d , expected %d  ", i, k,
                                  expected);
                System.out.println("");

            }
        }

    }

    static
    class Solution {
        static int floorSqrt(int n) {
            // Your code here
            // return sqrt(1, n, n);
            int start = 1;
            int end = n;
            int mid = start + (end - start) / 2;
            while (mid > start) {
                if (mid * mid == n) return mid;
                if (mid * mid > n) {
                    end = mid;
                }
                else {
                    start = mid;
                }
                mid = start + (end - start) / 2;
            }
            return mid;
        }

        private static int sqrt(int s, int e, int n) {
            int mid = s + (e - s) / 2;
            if (mid * mid == n || mid == s) return mid;
            else if (mid * mid > n) {
                return sqrt(s, mid, n);
            }
            else {
                return sqrt(mid, e, n);
            }
        }
    }

}
