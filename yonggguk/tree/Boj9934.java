package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj9934 {

    static int K;
    static int[] arr;
    static String[] answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        K = Integer.parseInt(br.readLine());
        arr = new int[(int)Math.pow(2, K)-1];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < (int)Math.pow(2, K)-1; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        answer = new String[K];
        for(int i = 0; i < K; i++){
            answer[i] = "";
        }
        solve(0, arr.length-1, 0);
        for(int i = 0; i < K; i++){
            System.out.println(answer[i]);
        }

    }
    public static void solve(int start, int end, int depth){
        if(depth == K) return;

        int middle = (start + end)/2;
        answer[depth] += arr[middle] + " ";
        solve(start, middle-1, depth+1);
        solve(middle+1, end, depth+1);
    }
}
