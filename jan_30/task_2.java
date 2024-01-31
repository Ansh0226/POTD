//2089. Find Target Indices After Sorting Array
//        Solved
//        Easy
//        Topics
//        Companies
//        Hint
//        You are given a 0-indexed integer array nums and a target element target.
//
//        A target index is an index i such that nums[i] == target.
//
//        Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,5,2,3], target = 2
//        Output: [1,2]
//        Explanation: After sorting, nums is [1,2,2,3,5].
//        The indices where nums[i] == 2 are 1 and 2.
//        Example 2:
//
//        Input: nums = [1,2,5,2,3], target = 3
//        Output: [3]
//        Explanation: After sorting, nums is [1,2,2,3,5].
//        The index where nums[i] == 3 is 3.
//        Example 3:
//
//        Input: nums = [1,2,5,2,3], target = 5
//        Output: [4]
//        Explanation: After sorting, nums is [1,2,2,3,5].
//        The index where nums[i] == 5 is 4.
//
//
//        Constraints:
//
//        1 <= nums.length <= 100
//        1 <= nums[i], target <= 100
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int start=0,end = nums.length-1;
        int mid = (start+end)/2;
        List<Integer> alist = new ArrayList<Integer>();
        while(start<=end){
            if(nums[mid]== target){
                alist.add(mid);
                int pre=mid-1,next=mid+1;
                while(pre>=0&&nums[pre]==target){
                    alist.add(pre);
                    pre--;
                }
                while(next<nums.length&&){
                    alist.add(next);
                    next++;
                }
                break;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=(end+start)/2;
        }
        Collections.sort(alist);
        return alist;
    }
}