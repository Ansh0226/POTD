//A. Love Story
//        time limit per test1 second
//        memory limit per test256 megabytes
//        inputstandard input
//        outputstandard output
//        Timur loves codeforces. That's why he has a string s
//        having length 10
//        made containing only lowercase Latin letters. Timur wants to know how many indices string s
//        differs from the string "codeforces".
//
//        For example string s=
//        "coolforsez" differs from "codeforces" in 4
//        indices, shown in bold.
//
//        Help Timur by finding the number of indices where string s
//        differs from "codeforces".
//
//        Note that you can't reorder the characters in the string s
//        .
//
//        Input
//        The first line contains a single integer t
//        (1≤t≤1000
//        ) — the number of test cases.
//
//        Each test case is one line and contains the string s
//        , consisting of exactly 10
//        lowercase Latin characters.
//
//        Output
//        For each test case, output a single integer — the number of indices where string s
//        differs.
//
//        Example
//        inputCopy
//        5
//        coolforsez
//        cadafurcie
//        codeforces
//        paiuforces
//        forcescode
//        outputCopy
//        4
//        5
//        0
//        4
//        9



import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        String str = "codeforces";
        while(testcase>0){
            String test = sc.next();
            int count =0;
            for(int i=0;i<10;i++){
                if(str.charAt(i)!= test.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
            testcase--;
        }

    }
}