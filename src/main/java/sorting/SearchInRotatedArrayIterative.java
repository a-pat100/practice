package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class SearchInRotatedArrayIterative {
    public static void main(String[] args) {
        boolean noFalseFound = true;
        for (int j = 0; j < 50000; j++) {
            System.out.println("testing : " + j);
            int[] arr = new int[StdRandom.uniformInt(2, 10)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = StdRandom.uniformInt(1, 20);
            }
            int p = StdRandom.uniformInt(0, arr.length);
            int x = arr[StdRandom.uniformInt(0, arr.length)];
            Arrays.sort(arr);
            rotateByP(arr, p);
            int ansIndex = find(arr, x);
            if (ansIndex == -1) {
                System.out.println("*************************************************");
                noFalseFound &= false;
            }
            System.out.println("P = " + p);
            Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
            System.out.println("X = " + x);
            System.out.println("AnsIndex = " + ansIndex);
            System.out.println();
        }
        System.out.println("Final Verdict : " + noFalseFound);
    }


    static int find(int[] a, int x) {
        int s = 0;
        int l = a.length - 1;
        int m = s + (l - s) / 2;
        // IfSorted

        while (s <= l) {
            m = s + (l - s) / 2;
            if (a[m] == x) return m;
            if (m == s) if (a[l] == x) return l;
            System.out.println("Start : " + s + " Mid : " + m
                                       + " End : " + l);
            if (a[s] <= a[m] && a[m] <= a[l]) {
                System.out.println("Returned by Arrays Binary Search");
                return Math.max(-1, Arrays.binarySearch(a, s, l + 1, x));
            }
            if (a[m] >= a[s]) {
                if (x >= a[s] && x < a[m]) {
                    return Math.max(-1, Arrays.binarySearch(a, s, m, x));
                }
                else {
                    s = m + 1;
                }
            }
            else {
                if (x > a[m] && x <= a[l]) {
                    return Math.max(-1, Arrays.binarySearch(a, m + 1, l + 1, x));
                }
                else {
                    l = m - 1;
                }
            }
        }
        if (s == l && a[s] == x) return s;
        return -1;
    }

    public static void rotateByP(int[] arr, int p) {
        int[] a = arr.clone();
        int j = 0;
        for (int i = arr.length - p - 1; i < arr.length; i++) {
            a[j++] = arr[i];
        }
        int i = 0;
        while (j < arr.length) {
            a[j++] = arr[i++];
        }

        for (int l = 0; l < arr.length; l++) {
            arr[l] = a[l];
        }
    }

}
