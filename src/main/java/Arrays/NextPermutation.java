/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        Arrays.stream(nextPermutation(new int[] { 5, 1, 1 })).forEach(System.out::print);

    }

    public static int[] nextPermutation(int[] n) {
        // find peak element
        int peak = n.length - 1;
        while (peak > 0 && n[peak] <= n[peak - 1]) {
            peak--;
        }
        if (peak == 1 && n[1] <= n[0]) {
            peak--;
        }
        int i1 = peak;
        int j = n.length - 1;
        while (j > i1) {
            int k = n[i1];
            n[i1] = n[j];
            n[j] = k;
            j--;
            i1++;
        }
        if (peak == 0) return n;

        for (int i = peak; i < n.length; i++) {
            if (n[peak - 1] < n[i]) {
                int k = n[peak - 1];
                n[peak - 1] = n[i];
                n[i] = k;
                return n;
            }
        }


        return n;
    }


}
