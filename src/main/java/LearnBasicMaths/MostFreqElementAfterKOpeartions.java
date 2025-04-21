/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

import java.util.Arrays;

public class MostFreqElementAfterKOpeartions {
    public static void main(String[] args) {
        System.out.println("correct ans : " + Solution.maxFrequency(new int[] { 1, 4, 8, 13 }, 5));
        System.out.println(
                "your ans : " + Solution.maxFrequencyOptimaL(new int[] { 1, 4, 8, 13 }, 5));

    }

    static class Solution {
        public static int maxFrequency(int[] nums, int k) {
            Arrays.sort(nums);
            int maxElementCount = 1;
            for (int lastPosition = nums.length - 1; lastPosition >= 0; lastPosition--) {
                int firstInt = lastPosition;
                int sum = 0;
                while (firstInt >= 0) {
                    sum += nums[lastPosition] - nums[firstInt];
                    if (sum > k) {
                        break;
                    }
                    else {
                        maxElementCount = Math.max(maxElementCount, lastPosition - firstInt + 1);
                        firstInt--;
                    }
                }

            }
            return maxElementCount;
        }

        public static int maxFrequencyOptimaL(int[] nums, int k) {
            Arrays.sort(nums);
            int maxElementCount = 1;
            int firstPosition = nums.length - 1;
            int lastPosition = nums.length - 1;
            int kUsed = 0;
            int headElement;
            for (lastPosition = nums.length - 1; (lastPosition >= 0 && firstPosition > 0);
                 lastPosition--) {
                headElement = nums[lastPosition];
                if (lastPosition < nums.length - 1) {
                    kUsed -= (nums[lastPosition + 1] - headElement) * ((lastPosition
                            - firstPosition) + 1);
                }
                // include new elements on left in bracket so that max of K operations are needed for this.
                while (firstPosition > 0) {
                    if (headElement - nums[firstPosition - 1] + kUsed > k) {
                        break;
                    }
                    firstPosition--;
                    kUsed += headElement - nums[firstPosition];
                }
                maxElementCount = Math.max(maxElementCount, lastPosition - firstPosition + 1);
            }
            return maxElementCount;
        }
    }


}
