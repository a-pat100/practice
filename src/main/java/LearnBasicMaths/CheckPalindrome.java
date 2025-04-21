/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class CheckPalindrome {

    int reverseInt(int n) {
        // remove sign of int
        // initiate ans = 0

        // loop while n > 0
        // remove last digit if n and place it in front of ans at same position as it is from behind
        return n;

    }

    public static void main(String[] args) {
        var sol = new Solution();
        System.out.println(sol.isPalindrome(1001));

    }

    static class Solution {
        public int getFirstDigitOfInt(int n) {
            return (int) (n / Math.pow(10, (int) Math.log10(n)));
        }

        public int removeFirstDigitOfInt(int n) {
            int numberOfDigits = (int) Math.log10(n); // Total digits - 1
            int divisor = (int) Math.pow(10, numberOfDigits); // 10^(number of digits - 1)
            return n % divisor; //
        }

        public int getLastDigitOfInt(int n) {
            return n % 10;
        }

        public int gremoveLastDigitOfInt(int n) {
            return n / 10;
        }


        public boolean isPalindrome(int x) {
            if (x < 0) return false;
            int devisor = 1000000000;
            while (x / devisor == 0) {
                devisor /= 10;
            }
            while (devisor > 1) {
                if (((int) (x / devisor)) != (x % 10)) {
                    return false;
                }
                x = ((int) (x % devisor)) / 10;
                devisor = devisor / 100;
            }
            return true;
        }
    }

}
