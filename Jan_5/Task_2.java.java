//leetcode Q no. 242
//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//
//        Example 1:
//
//        Input: s = "anagram", t = "nagaram"
//        Output: true
//        Example 2:
//
//        Input: s = "rat", t = "car"
//        Output: false
//
//
//        Constraints:
//
//        1 <= s.length, t.length <= 5 * 104
//        s and t consist of lowercase English letters.

class Solution {
    public boolean isAnagram(String s, String t) {
        s = sortString(s);
        t = sortString(t);
        return s.equals(t);


    }
    private String sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return (String.valueOf(arr));
    }
}