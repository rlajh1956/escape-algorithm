import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/2108
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];
        int sum = 0;
        int min = 4001;
        int max = -4001;
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[x + 4000]++;
            sum += x;

            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }

        int median = -4001;
        int totalCnt = 0;
        int maxCnt = 0;
        int modeCnt = 0;
        int mode = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                int num = i - 4000;

                totalCnt += arr[i];
                if (median == -4001 && totalCnt > N / 2) {
                    median = num;
                }

                if (arr[i] > maxCnt) {
                    maxCnt = arr[i];
                    mode = num;
                    modeCnt = 1;
                } else if (arr[i] == maxCnt && modeCnt == 1) {
                    mode = num;
                    modeCnt++;
                }
            }
        }

        System.out.println(Math.round((double) sum / N));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}