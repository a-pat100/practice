/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays.Matrix;

public class SetMatrixLengthAndBredthToZeros {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3, 4 }, { 5, 0, 7, 8 }, { 0, 10, 11, 12 }, { 13, 14, 15, 0 }
        };

        Solution.setZeroes(arr);

    }


    public static class Solution {
        public static void setZeroes(int[][] n) {
            int length = n[0].length;
            int breadth = n.length;
            // check first row if zero
            boolean firstRowZero = false;
            for (int i = 0; i < n[0].length; i++) {
                if (n[0][i] == 0) {
                    firstRowZero = true;
                    break;
                }
            }
            boolean firstColZero = false;
            for (int i = 0; i < n.length; i++) {
                if (n[i][0] == 0) {
                    firstColZero = true;
                    break;
                }
            }


            for (int i = 1; i < breadth; i++) {
                for (int j = 1; j < length; j++) {
                    if (n[i][j] == 0) {
                        n[i][0] = 0;
                        n[0][j] = 0;
                    }

                }
            }

            for (int i = 1; i < n.length; i++) {
                if (n[i][0] == 0) {
                    for (int j = 0; j < n[0].length; j++) {
                        n[i][j] = 0;
                    }
                }
            }

            for (int j = 1; j < n[0].length; j++) {
                if (n[0][j] == 0) {
                    for (int i = 0; i < n.length; i++) {
                        n[i][j] = 0;
                    }
                }
            }

            if (firstRowZero) {
                for (int i = 0; i < n[0].length; i++) {
                    n[0][i] = 0;
                }
            }
            if (firstColZero) {
                for (int i = 0; i < n.length; i++) {
                    n[i][0] = 0;
                }
            }


        }
    }
}
