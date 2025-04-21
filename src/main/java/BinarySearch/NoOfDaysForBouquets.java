/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class NoOfDaysForBouquets {
    public static void main(String[] args) {
        System.out.println(Solution.minDays(new int[] { 7, 7, 7, 7, 12, 7, 7 }, 89945, 32127));

    }

    static class Solution {
        public static int minDays(int[] bloomDay, int nOfB, int sizeOfB) {
            int start = bloomDay[0];
            int end = bloomDay[0];
            for (int i : bloomDay) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }


            if ((long) nOfB * (long) sizeOfB > (long) bloomDay.length) {
                return -1;
            }
            while (start <= end) {
                int mid = (start + end) / 2;
                if (canMake(bloomDay, sizeOfB, nOfB, mid)) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            return start;
        }

        private static boolean canMake(int[] bloomDay, int sizeOfB, int numberOfBRequired,
                                       int day) {
            int noOfB = 0;
            int conTFlowers = 0;
            for (int i : bloomDay) {
                if (i <= day) {
                    conTFlowers++;
                }
                else if (conTFlowers > 0) {
                    noOfB += (conTFlowers / sizeOfB);
                    conTFlowers = 0;
                }
            }
            noOfB += (conTFlowers / sizeOfB);
            return (noOfB >= numberOfBRequired);
        }


    }
}
