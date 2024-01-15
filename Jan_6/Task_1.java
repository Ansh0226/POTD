// codeforces
// potd jan 6 task 1
//A. New Palindrome
//        time limit per test2 seconds
//        memory limit per test256 megabytes
//        inputstandard input
//        outputstandard output
//        A palindrome is a string that reads the same from left to right as from right to left. For example, abacaba, aaaa, abba, racecar are palindromes.
//
//        You are given a string s
//        consisting of lowercase Latin letters. The string s
//        is a palindrome.
//
//        You have to check whether it is possible to rearrange the letters in it to get another palindrome (not equal to the given string s
//        ).
//
//        Input
//        The first line contains a single integer t
//        (1≤t≤1000
//        ) — the number of test cases.
//
//        The only line of each test case contains a string s
//        (2≤|s|≤50
//        ) consisting of lowercase Latin letters. This string is a palindrome.
//
//        Output
//        For each test case, print YES if it is possible to rearrange the letters in the given string to get another palindrome. Otherwise, print NO.
//
//        You may print each letter in any case (YES, yes, Yes will all be recognized as positive answer, NO, no and nO will all be recognized as negative answer).
//
//        Example
//        inputCopy
//        3
//        codedoc
//        gg
//        aabaa
//        outputCopy
//        YES
//        NO
//        NO
//        Note
//        In the first test case, it is possible to rearrange the letters in the palindrome codedoc to obtain the string ocdedco, which is different from the given string, but also a palindrome.





import java.util.HashMap;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase>0){
           HashMap<Character,Integer> mp = new HashMap<>();
           String str = sc.next();
           for(char i: str.toCharArray()){
               mp.put(i,mp.getOrDefault(i,0)+1);
           }
           int count=0;
           for(int i : mp.values()){
               if(i>=2) {
                   count++;
               }

           }
           if(count>1){
               System.out.println("Yes");
           }
           else{
               System.out.println("NO");
           }




            testcase--;
        }
    }
}
