import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0) {
            String str = "abc";
            String goal = sc.next();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (goal.charAt(i) == str.charAt(i)) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        test--;
        }

    }
}
