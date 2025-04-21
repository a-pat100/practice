/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class ArmstrongNumbers {
    /*
    An Armstrong number of three digits is a number such that
    the sum of the cubes of its digits is equal to the number itself.
    371 is an Armstrong number since 33 + 73 + 13 = 371.
     */

    public static void main(String[] args) {
        System.out.println(Solution.armstrongNumber(371));

    }

    static class Solution {
        static boolean armstrongNumber(int n) {
            int power = 1 + (int) Math.log10(n);
            int total = n;
            while (n > 0 && total >= 0) {
                total -= Math.pow(n % 10, power);
                n /= 10;
            }
            return total == 0;

        }
    }

}
