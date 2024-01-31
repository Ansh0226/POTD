//LEET-560. Subarray Sum Equals K
//        Solved
//        Medium
//        Topics
//        Companies
//        Hint
//        Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//        A subarray is a contiguous non-empty sequence of elements within an array.
//
//
//
//        Example 1:
//
//        Input: nums = [1,1,1], k = 2
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,2,3], k = 3
//        Output: 2
//
//
//        Constraints:
//
//        1 <= nums.length <= 2 * 104
//        -1000 <= nums[i] <= 1000
//        -107 <= k <= 107
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int sum =0,start=0,end=0, count =0;
//         if(nums.length==1){
//             if(nums[0]==k) return 1;
//             else return 0;
//         }
//         while(end<nums.length||start<nums.length){
//            if(end<nums.length) sum+=nums[end];
//            else{
//                 sum-=nums[start]--;
//                 start++;
//            }

//             while(start<nums.length&&sum>k){
//                 sum-=nums[start]--;
//                 start++;
//             }
//             if(sum==k){
//                 count++;
//             }
//             end++;
//         }
//         return count;
//     }
// }
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
