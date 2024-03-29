//C. Cypher
//        time limit per test1 second
//        memory limit per test256 megabytes
//        inputstandard input
//        outputstandard output
//        Luca has a cypher made up of a sequence of n
//        wheels, each with a digit ai
//        written on it. On the i
//        -th wheel, he made bi
//        moves. Each move is one of two types:
//
//        up move (denoted by U
//        ): it increases the i
//        -th digit by 1
//        . After applying the up move on 9
//        , it becomes 0
//        .
//        down move (denoted by D
//        ): it decreases the i
//        -th digit by 1
//        . After applying the down move on 0
//        , it becomes 9
//        .
//        Example for n=4
//        . The current sequence is 0 0 0 0.
//        Luca knows the final sequence of wheels and the moves for each wheel. Help him find the original sequence and crack the cypher.
//
//        Input
//        The first line contains a single integer t
//        (1≤t≤100
//        ) — the number of test cases.
//
//        The first line of each test case contains a single integer n
//        (1≤n≤100
//        ) — the number of wheels.
//
//        The second line contains n
//        integers ai
//        (0≤ai≤9
//        ) — the digit shown on the i
//        -th wheel after all moves have been performed.
//
//        Then n
//        lines follow, the i
//        -th of which contains the integer bi
//        (1≤bi≤10
//        ) and bi
//        characters that are either U
//        or D
//        — the number of moves performed on the i
//        -th wheel, and the moves performed. U
//        and D
//        represent an up move and a down move respectively.
//
//        Output
//        For each test case, output n
//        space-separated digits  — the initial sequence of the cypher.
//
//        Example
//        inputCopy
//        3
//        3
//        9 3 1
//        3 DDD
//        4 UDUU
//        2 DU
//        2
//        0 9
//        9 DDDDDDDDD
//        9 UUUUUUUUU
//        5
//        0 5 9 8 3
//        10 UUUUUUUUUU
//        3 UUD
//        8 UUDUUDDD
//        10 UUDUUDUDDU
//        4 UUUU
//        outputCopy
//        2 1 1
//        9 0
//        0 4 9 6 9
//        Note
//        In the first test case, we can prove that initial sequence was [2,1,1]
//        . In that case, the following moves were performed:
//
//        On the first wheel: 2→D1→D0→D9
//        .
//        On the second wheel: 1→U2→D1→U2→U3
//        .
//        On the third wheel: 1→D0→U1
//        .
//        The final sequence was [9,3,1]
//        , which matches the input.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase= sc.nextInt();
        while(testcase>0){
            int wheel = sc.nextInt();
            int [] warray = new int [wheel];
            for(int i =0;i<wheel;i++){
                warray[i]=sc.nextInt();
            }
            for(int i =0;i<wheel;i++){
                int op= sc.nextInt();
                String str = sc.next();
                for (int j =0;j<op;j++){
                    if(str.charAt(j)=='U'){
                        if(warray[i]==0){
                            warray[i]=9;
                        }else{
                            warray[i]--;
                        }
                    }else{
                        if (warray[i]==9){
                            warray[i]=0;
                        }else{
                            warray[i]++;
                        }
                    }

                }
            }
            for (int i:warray) {
                System.out.print(i+" ");
            }
            System.out.println();


            testcase--;
        }
   }
}