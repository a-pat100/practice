/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

import java.util.ArrayList;

public class AllFactorialsBelow {
    public static void main(String[] args) {
        System.out.println(Solution.factorialNumbers(2));
    }

    static class Solution {
        static ArrayList<Long> ans = new ArrayList<>();

        static ArrayList<Long> factorialNumbers(long n) {
            return factorialNumbers(n, 1l);

        }

        static ArrayList<Long> factorialNumbers(long n, long i) {
            if (i == 1) {
                ans.add(1l);
                return factorialNumbers(n, i + 1);
            }
            else {
                if (ans.get(ans.size() - 1) * ans.size() + 1 > n) {
                    return ans;
                }
                else {
                    ans.add(ans.get(ans.size() - 1) * (ans.size() + 1));
                    return factorialNumbers(n, i + 1);
                }
            }
        }


    }


}
