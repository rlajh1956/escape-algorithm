import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1193
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = 1;
        int i = 1;
        while (n < X) {
            n += i + 1;
            i++;
        }
        int a = i - (n - X);
        int b = n - X + 1;
        if (i % 2 == 0) {
            System.out.println(a + "/" + b);
        } else {
            System.out.println(b + "/" + a);
        }
    }
}