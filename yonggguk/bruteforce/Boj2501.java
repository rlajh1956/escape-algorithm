package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj2501 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();
        list.add(n);
        for(int i = n/2; i > 0; i--) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        if(list.size() < k) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k-1));
        }
    }
}
