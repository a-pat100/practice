package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchFirstAndLastPosition {
    public static void main(String[] args) {
        boolean noFalseFound = true;
        for (int j = 0; j < 50000; j++) {
            System.out.println("testing : " + j);
            int[] arr = new int[StdRandom.uniformInt(2, 20)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = StdRandom.uniformInt(1, 10);
            }

            int x = arr[StdRandom.uniformInt(1, arr.length)];
            Arrays.sort(arr);
            Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
            System.out.println("x : " + x);
            ArrayList<Integer> response = find(arr, arr.length, x);
            int first = -1;
            int last = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    first = i;
                    break;
                }
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == x) {
                    last = i;
                    break;
                }
            }
            noFalseFound = noFalseFound && (first == response.get(0)
                    && last == response.get(1));
            System.out.println("Response = " + response.get(0) + "," + response.get(1) + "  " +
                                       "Response Matched :" + (first == response.get(0)
                    && last == response.get(1)) + " , first : " + first + " last : " + last);
        }

        System.out.println("Final Verdict : " + noFalseFound);
    }

    static ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 1) {
            if (arr[0] == x) {
                ans.add(0);
                ans.add(0);
            }
            else {
                ans.add(-1);
                ans.add(-1);
            }
            return ans;
        }
        // code here
        int first = leftgSearch(arr, x, 0, n - 1);
        int last = rightgSearch(arr, x, 0, n - 1);
        ans.add(first);
        ans.add(last);
        return ans;
    }

    static int leftgSearch(int arr[], int x, int start, int end) {
        if (end <= start) {
            if (arr[start] == x) {
                return start;
            }
            else return -1;
        }
        int mid = start + (end - start) / 2;
        // if (mid == 0) {
        //     if (arr[mid] == x) {
        //         return 0;
        //     }
        // }
        if (arr[mid] == x) {
            if (mid == 0) return mid;
            if (arr[mid - 1] < x) return mid;
            else return leftgSearch(arr, x, start, mid - 1);
        }
        else if (arr[mid] < x) {
            return leftgSearch(arr, x, mid + 1, end);
        }
        else return leftgSearch(arr, x, start, mid - 1);
    }

    static int rightgSearch(int arr[], int x, int start, int end) {
        if (end <= start) {
            if (arr[start] == x) {
                return start;
            }
            else return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == x) {
            if (arr[mid + 1] > x) return mid;
            else return rightgSearch(arr, x, mid + 1, end);
        }
        if (arr[mid] < x) return rightgSearch(arr, x, mid + 1, end);
        else return rightgSearch(arr, x, start, mid - 1);
    }

}
