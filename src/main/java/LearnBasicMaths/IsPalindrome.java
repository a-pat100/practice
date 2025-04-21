/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int first = 0;

        while (!Character.isLetterOrDigit(s.charAt(first))) {
            first++;
        }


        System.out.println(Solution.isPalindrome("A man, a plan, a canal: Panama"));


    }

    static class Solution {
        public static boolean isPalindrome(String s) {
            return isPalindrome(s, 0, s.length() - 1);
        }

        private static boolean isPalindrome(String s, int first, int last) {

            while (first < last && !Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            }
            while (first < last && !Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            }
            if (last <= first) {
                return true;
            }
            if (Character.toLowerCase(s.charAt(first)) == Character.toLowerCase(
                    s.charAt(last))) {
                return isPalindrome(s, first + 1, last - 1);
            }
            else return false;

        }


    }

}
