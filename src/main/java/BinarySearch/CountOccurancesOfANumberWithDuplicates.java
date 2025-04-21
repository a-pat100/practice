/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package BinarySearch;

public class CountOccurancesOfANumberWithDuplicates {
    public static void main(String[] args) {
        int arr[] = new int[] {
                4, 5, 6, 7, 8, 9,
                };
        System.out.println(Solution.countFreq(arr, 2));

    }

    static class Solution {
        static int countFreq(int[] n, int target) {
            // code hereint start = 0;
            int start = 0;
            int end = n.length - 1;
            int mid;
            int x = -1;
            while (end >= start) {
                mid = (start + end) / 2;
                if (start == end) {
                    if (n[start] == target) {
                        x = start;
                        break;
                    }
                    else return 0;
                }
                else if (n[mid] < target) {
                    start = mid + 1;
                }
                else if (n[mid] == target) {
                    end = mid;
                }
                else {
                    end = mid - 1;
                }
            }
            if (x == -1) return 0;
            int y = -1;
            start = x;
            end = n.length - 1;
            while (end >= start) {
                mid = (start + end + 1) / 2;
                if (start == end) {
                    y = start;
                    break;
                }
                else if (n[mid] > target) {
                    end = mid - 1;
                }
                else if (n[mid] == target) {
                    start = mid;
                }
                else {
                    start = mid + 1;
                }
            }
            return y - x + 1;
        }
    }
}



