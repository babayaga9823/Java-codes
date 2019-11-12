import java.util.*;

class prog63 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m, n, num1, num2, c = 0, c1 = 0;
        System.out.println("enter the range");
        m = sc.nextInt();
        n = sc.nextInt();
        for (int i = m; i <= n - 2; i++) {
            num1 = i;
            num2 = i + 2;
            c = 0;
            c1 = 0;
            for (int j = 1; j <= num1; j++) {
                if (num1 % j == 0) {
                    c = c + 1;
                }
            }
            for (int j = 1; j <= num2; j++) {
                if (num2 % j == 0) {
                    c1 = c1 + 1;
                }
            }
            if (c == 2 && c1 == 2) {
                System.out.println(num1 + " " + num2);
            }
        }
    }
}