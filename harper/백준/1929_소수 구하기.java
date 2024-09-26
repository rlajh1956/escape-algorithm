import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1929
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean[] arr = new boolean[N + 1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}