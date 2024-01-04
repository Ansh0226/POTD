import java.util.Arrays;
//leetcode Q.no. - 268

public class JAN_01_task2{
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return nums.length;
    }
}