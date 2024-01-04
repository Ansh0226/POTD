import java.util.Arrays;
import java.util.Scanner;

public class  JAN_01_task1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = print2largest(arr,n);
        System.out.println(ans);
    }
    static int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        for(int i =0;i<n-1;i++){
            if(arr[n-1-i]!=arr[n-2-i]){
                return arr[n-2-i];
            }
        }

        return -1;
    }

}