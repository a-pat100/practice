/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package Arrays;

public class SortedAndRotated {
    public static void main(String[] args) {
        System.out.println(check(new int[] { 1, 1, 1 }));

    }

    public static boolean check(int[] nums) {
        // if not rotated
        if (nums[nums.length - 1] > nums[0]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) return false;
            }
            return true;
        }
        // if rotated
        int first = 0;
        int last = nums.length - 1;
        while (first < last && nums[first] <= nums[first + 1]) {
            first++;
        }
        while (first < last && nums[last] >= nums[last - 1]) {
            last--;
        }
        return (first == last - 1);


    }


}
