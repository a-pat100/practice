package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

public class MergeSortBottomUp {
    // Basic MergeSort

    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();

        // steps from 2 to a.length
        for (int step = 1; step < (a.length); step = step * 2) {
            System.out.println("Sorting for step size : " + step);
            for (int start = 0; start < (a.length) - step; start = start + 2 * step) {
                int end = Math.min(start + 2 * step - 1, a.length - 1);
                int mid = start + step - 1;
                merge(a, aux, start, mid, end);
            }
            // if(step > a.length) break;
        }
    }

    private static void merge(Comparable[] a, Comparable[] aux, int start, int mid, int end) {
        System.out.println("merge called for start = " + start + " mid = " + mid + " end = " + end);
        if (start == end) return;
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
        boolean noFalseFound = true;
        for (int j = 0; j < 50000; j++) {
            System.out.println("testing : " + j);
            Integer[] arr = new Integer[StdRandom.uniformInt(1, 50)];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = StdRandom.uniformInt(1, 1000);
            }
            // Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
            sort(arr);
            // System.out.println();
            // System.out.println(sorted(arr));
            noFalseFound = noFalseFound && sorted(arr);
            // Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
        }
        System.out.println(noFalseFound);
    }

}

