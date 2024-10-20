package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11005 {
    // 백준 11005 번 https://www.acmicpc.net/problem/11005
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        //대문자 65~90 아스키 코드
        while(N != 0){
            // 10 진수 보다 큰 수라면 알파벳 대문자로 표현
            if(N%B >= 10) sb.append((char) ((N % B) + 55));
            else sb.append(N%B);
            N /= B;
        }

        System.out.println(sb.reverse().toString());
    }
}
