/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

import java.util.ArrayList;
import java.util.List;

public class FrequencyOfElements {
    public static void main(String[] args) {
        System.out.println(Solution.frequencyCount(new int[] { 2, 3, 2, 3, 5 }));

    }


    static class Solution {
        // Function to count the frequency of all elements from 1 to N in the array.
        static public List<Integer> frequencyCount(int[] arr) {
            // do modify in the given array
            int[] ans = new int[arr.length];


            for (int i : arr) {
                ans[i - 1]++;
            }
            List<Integer> a = new ArrayList<>();
            for (int i : ans) {
                a.add(i);
            }
            return a;

        }
    }
}
