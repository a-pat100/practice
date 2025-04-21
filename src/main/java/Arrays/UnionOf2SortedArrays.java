/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 4, 5 };
        int[] b = new int[] { 1, 2, 3, 6, 7 };
        ArrayList<Integer> ans = Solution.findUnion(a, b);
        System.out.println(ans);

    }

    static class Solution {
        // Function to return a list containing the union of the two arrays.
        public static ArrayList<Integer> findUnion(int a[], int b[]) {
            // add your code here
            ArrayList<Integer> ans = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (i < a.length || j < b.length) {
                if (j == b.length) {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                        ans.add(a[i]);
                    }
                    i++;
                    continue;
                }
                else if (i == a.length) {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                        ans.add(b[j]);
                    }
                    j++;
                    continue;
                }
                if (a[i] < b[j]) {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                        ans.add(a[i]);
                    }
                    i++;
                }
                else if (a[i] > b[j]) {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                        ans.add(b[j]);
                    }
                    j++;
                }
                else {
                    if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                        ans.add(b[j]);
                    }
                    i++;
                    j++;
                }

            }
            return ans;

        }
    }


}
