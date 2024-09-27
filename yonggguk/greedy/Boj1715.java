package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Boj1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;

        for(int i = 0; i < n; i++) {
            pq.offer(Integer.parseInt(br.readLine()));
        }
        while(pq.size() > 1) {
            int temp = pq.poll() + pq.poll();
            ans += temp;
            pq.offer(temp);
        }
        System.out.println(ans);
    }
}
