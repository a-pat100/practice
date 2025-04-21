/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package LearnBasicMaths;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 7, 6, 2, 3, 4 };
        mergesort(arr);
        Arrays.stream(arr).forEach(System.out::println);

    }

    private static void mergesort(int[] arr) {
        int buffer[] = new int[arr.length];
        MergeSort(buffer, arr, 0, arr.length - 1);


    }

    private static void MergeSort(int[] buffer, int[] arr, int start, int end) {
        if (start == end) return;
        int mid = (start + end) / 2;
        MergeSort(buffer, arr, start, mid);
        MergeSort(buffer, arr, mid + 1, end);
        merge(buffer, arr, start, mid, end);

    }

    private static void merge(int[] buffer, int[] arr, int start, int mid, int end) {
        int i;
        for (i = start; i <= end; i++) {
            buffer[i] = arr[i];
        }
        int x = start;
        int y = mid + 1;
        for (i = start; i <= end; i++) {
            if ((y > end) || (x <= mid && buffer[x] < buffer[y])) {
                arr[i] = buffer[x++];
            }
            else {
                arr[i] = buffer[y++];
            }

        }


    }

    public static void insertionSort(int[] arr) {
        for (int marker = 0; marker < arr.length - 1; marker++) {
            int j = marker + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                exchange(arr, j, --j);

            }
        }
    }


    public static void selectionSort(int[] arr) {
        for (int marker = 0; marker < arr.length; marker++) {
            int lowest = arr.length - 1;
            for (int i = arr.length - 1; i >= marker; i--) {
                if (arr[i] < arr[lowest]) {
                    lowest = i;
                }
            }
            int k = arr[marker];
            arr[marker] = arr[lowest];
            arr[lowest] = k;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                }
            }
        }
    }


    public static void exchange(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

}
