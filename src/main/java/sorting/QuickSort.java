package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int j = 1000;
        while (j-- > 0) {
            Integer[] arr = new Integer[StdRandom.uniformInt(0, 100)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = StdRandom.uniformInt(1, 1000);
            }
            // Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
            sort(arr);
            // System.out.println();
            if (!MergeSortNormal.sorted(arr)) {
                System.out.println("didint sort");
                Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
            }
        }
    }


    public static void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void shuffle(Comparable[] a) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            int q = random.nextInt(i + 1);
            exch(a, q, i);
        }
    }

    private static void exch(Comparable[] a, int q, int i) {
        Comparable temp = a[q];
        a[q] = a[i];
        a[i] = temp;
    }


    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) return;
        int pivot = partition(a, start, end);
        sort(a, start, pivot - 1);
        sort(a, pivot + 1, end);
    }


    public static int partition(Comparable[] a, int start, int end) {
        // System.out.println("partition called on : start = " + start + " end = " + end);
        if (start == end) return start;
        int low = start;
        int hi = end + 1;
        while (true) {
            while (a[++low].compareTo(a[start]) < 0) {
                if (low == end) break;
            }
            while (a[--hi].compareTo(a[start]) > 0) {
                if (hi == start) break;
            }
            if (hi <= low) break;
            exch(a, hi, low);
        }
        return hi;
    }
}
