/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class Commons {
    public static void main(String[] args) {

    }

    public static void Print2DArray(int[][] arr) {
        for (int[] i : arr
        ) {
            for (int j : i
            ) {
                System.out.print(j + " ,");
            }
            System.out.println();
        }
    }

    public static void print1DArray(int[] arr) {
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " , ");
        }
    }


    public static void reverse(int[] arr, int startInclusive, int endInclusive) {
        while (endInclusive > startInclusive) {
            int k = arr[startInclusive];
            arr[startInclusive] = arr[endInclusive];
            arr[endInclusive] = k;
            endInclusive--;
            startInclusive++;
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }


}
