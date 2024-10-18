package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    // 백준 2745 번 https://www.acmicpc.net/problem/2745
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        // 첫 시작은 1승부터 시작 (B^0 = 1)
        int tmp = 1;
        // 자릿수 마다 합계
        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
            char C = N.charAt(i);
            //아스키 코드값으로 숫자의 범위를 비교
            if('0' <= C && C <= '9'){
                sum += (C - '0') * tmp;
            }else{
                sum += (C- 'A' + 10) * tmp; //10부터 A이기 때문에 10을 더해준다
            }
            tmp*= B; //자리수가 한칸씩 왼쪽으로 간다는 것은 완쪽으로 B곲하기 한 것과 같다
        }

        System.out.println(sum);
    }
}
