import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[][] dp = new int[n][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1;
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = j; k < 10; k++) {
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println(Arrays.stream(dp[n-1]).sum()%10007);
    }
}
