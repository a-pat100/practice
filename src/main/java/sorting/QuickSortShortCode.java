package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class QuickSortShortCode {
    public static void main(String[] args) {
        int[] arr = new int[StdRandom.uniformInt(1, 50)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniformInt(1, 1000);
        }
        Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
        quickSort(arr, 0, arr.length - 1, arr.length);
        System.out.println();
        if (!sorted(arr)) {
            System.out.println("Array not sorted");
            Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
        }
    }

    static boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 1] < arr[i]) return false;
        }
        return true;
    }

    public static void quickSort(int[] arr, int startIndex, int endIndex, int n) {
        System.out.println("start :" + startIndex + " end : " + endIndex);
        if (endIndex <= startIndex) return;
        int start = startIndex;
        int end = endIndex + 1;
        while (end > start) {
            while (arr[++start] < arr[startIndex]) {
                if (start == endIndex) break;
            }
            while (arr[--end] > arr[startIndex]) {
                if (end == startIndex) break;
            }
            if (end <= start) break;
            exch(arr, start, end);
        }
        quickSort(arr, startIndex, end - 1, n);
        quickSort(arr, end + 1, endIndex, n);
    }

    static void exch(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = a;
    }


}
