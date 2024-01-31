//LEET - 3. Longest Substring Without Repeating Characters
//        Solved
//        Medium
//        Topics
//        Companies
//        Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//        s consists of English letters, digits, symbols and spaces.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> alist = new ArrayList<Character>();
        int res = 0;

        for(char i: s.toCharArray()){
            if(alist.contains(i)==false){
                alist.add(i);
            }
            else{
                int index = alist.indexOf(i);
                res = Math.max(res,alist.size());
                alist.add(i);
                if(index ==0) alist.remove(0);
                else alist.subList(0, index+1).clear();
            }


        }
        res = Math.max(res,alist.size());

        return res;
    }
}