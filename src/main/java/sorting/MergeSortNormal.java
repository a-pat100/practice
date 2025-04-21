package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class MergeSortNormal {
    // Basic MergeSort

    public static void sort(Comparable[] a) {
        Object[] aux = a.clone();
        sort(a, (Comparable[]) aux, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, Comparable[] aux, int start, int end) {
        if (end - start < 1) {
            return;
        }

        int mid = start + (end - start) / 2;
        sort(a, aux, start, mid);
        sort(a, aux, mid + 1, end);
        merge(a, aux, start, mid, end);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int start, int mid, int end) {
        // System.out.println("merge called for start = " + start + " mid = " + mid + " end = " + end);
        for (int i = start; i <= end; i++) {
            aux[i] = a[i];
        }
        int hi = mid + 1;
        int low = start;
        int i = start;
        while (i <= end) {
            if (low > mid) a[i++] = aux[hi++];
            else if (hi > end) a[i++] = aux[low++];
            else if (less(aux[hi], aux[low])) {
                a[i++] = aux[hi++];
            }
            else a[i++] = aux[low++];
        }
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static boolean sorted(Comparable[] a) {
        int i = 0;
        while (i < a.length - 1) {
            if (less(a[i + 1], a[i])) return false;
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[StdRandom.uniformInt(1, 50)];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = StdRandom.uniformInt(1, 1000);
        }
        Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
        sort(arr);
        System.out.println();
        System.out.println(sorted(arr));
        Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
    }
}
