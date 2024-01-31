//LEET -/1004. Max Consecutive Ones III
//        Solved
//        Medium
//        Topics
//        Companies
//        Hint
//        Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
//
//
//
//        Example 1:
//
//        Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
//        Output: 6
//        Explanation: [1,1,1,0,0,1,1,1,1,1,1]
//        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//        Example 2:
//
//        Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
//        Output: 10
//        Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
//        Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        nums[i] is either 0 or 1.
//        0 <= k <= nums.length
// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         HashMap <Integer,Integer>hmap = new HashMap<Integer,Integer>();
//         int start =0,end=0,max=0;
//         while(end<nums.length){
//             hmap.put(nums[end],hmap.getOrDefault(nums[end],0)+1);
//             if(hmap.get(0)!=null&&hmap.get(0)==k+1){
//                 int sum =0;                                           // by hashmap
//                 if(hmap.get(0)!=null) sum+=hmap.get(0);
//                 if(hmap.get(1)!=null) sum+= hmap.get(1);
//                 sum-=1;
//                 max = Math.max(max,sum);
//                 while(hmap.get(0)==k+1){
//                     hmap.put(nums[start],hmap.get(nums[start])-1);
//                     start++;
//                 }
//             }end++;
//         }
//         int sum =0;
//         if(hmap.get(0)!=null) sum+=hmap.get(0);
//         if(hmap.get(1)!=null) sum+= hmap.get(1);
//         if(hmap.get(0)!=null&hmap.get(0)==k) sum-=1;
//         max = Math.max(max,sum);
//         return max;
//     }
// }

class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0, end = 0, max = 0, zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0)
                zeros++;
            while (zeros > k) {
                if (nums[start] == 0)
                    zeros--;
                start++;
                if (start >= fruits.length)
                    break;
            }
            max = Math.max(max, end - start + 1);
            end++;
        }

        return max;
    }
}
