package sorting;/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class QuickSelect {
    public static void main(String[] args) {
        int j = 1000000;
        int error = 0;
        while (j-- > 0) {
            Integer[] arr = new Integer[StdRandom.uniformInt(1, 100)];
            int k = StdRandom.uniformInt(0, arr.length);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = StdRandom.uniformInt(1, 10);
            }
            // Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));

            Integer[] arr1 = arr.clone();
            MergeSortNormal.sort(arr1);
            // System.out.println();
            int ak = arr1[k];
            System.out.println(MergeSortNormal.sorted(arr));
            Comparable qk = kthLargest(arr, k);
            if (ak != (Integer) qk) {
                error++;
                System.out.println("didint work k =" + k);
                System.out.println();
                Arrays.stream(arr).forEach(element -> System.out.print(element + ", "));
                System.out.println();
            }
        }
        System.out.println("Errors : " + error);
    }


    private static Comparable kthLargest(Comparable[] a, int k) {
        QuickSort.shuffle(a);
        return kthLargest(a, k, 0, a.length - 1);
    }


    private static Comparable kthLargest(Comparable[] a, int k, int start, int end) {
        int p = QuickSort.partition(a, start, end);
        if (p == k) return a[p];
        if (p > k) return kthLargest(a, k, start, p - 1);
        else return kthLargest(a, k, p + 1, end);
    }

}