package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1463 {
    // 1463번 https://www.acmicpc.net/problem/1463
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 최소값을 저장할 dp 배열
        int[] dp = new int[N+1];

        for (int i = 2; i <= N; i++) {
            // dp 배열의 index 는 해당 index (i) 의 최소값 counting
            dp[i] = dp[i - 1] + 1; // -1
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);   // 2로 나눌 수 있을 시 count + 1
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);   // 3으로 나눌 수 있을 시 count +1
        }

        System.out.println(dp[N]);
    }
}
