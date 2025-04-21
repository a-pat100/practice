/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class Find2ndLargestElement {
    public static void main(String[] args) {
        System.out.print(Solution.getSecondLargest(new int[] { 1, 2, 3, 4, 45, 56, 76, 7, 8, }));

    }


    static class Solution {
        public static int getSecondLargest(int[] arr) {
            // Code Here
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int i : arr) {
                if (i > secondLargest) {
                    if (i > largest) {
                        secondLargest = largest;
                        largest = i;
                    }
                    else {
                        if (i != largest) {
                            secondLargest = i;
                        }
                    }
                }
            }
            if (secondLargest == Integer.MIN_VALUE) return -1;
            else return secondLargest;

        }
    }


}
