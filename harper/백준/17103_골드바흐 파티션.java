import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/17103
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[1000001];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < 1000001; i++) {
            if (!arr[i]) {
                for (int j = i + i; j < 1000001; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= N / 2; j++) {
                if (!arr[j] && !arr[N - j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}