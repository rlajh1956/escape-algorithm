package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int cnt = 0;
        while (true) {
            if (sum >= m) {
                sum -= arr[p1++];
            } else if (p2 == n) {
                break;
            } else {
                sum += arr[p2++];
            }
            if (sum == m) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
