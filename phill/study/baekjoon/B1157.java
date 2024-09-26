package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B1157 {
    // 1157 번 https://www.acmicpc.net/problem/1157
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String r = bf.readLine().toUpperCase();

        HashMap<Character, Integer> hash = new HashMap<>();

        for (char c : r.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        char result = '?';

        for (char c : hash.keySet()) {
            int count = hash.get(c);
            if (count > maxCount) {
                maxCount = count;
                result = c;
            } else if (count == maxCount) {
                result = '?'; // 빈도가 같은 알파벳이 있을 경우 ?로 설정
            }
        }

        System.out.println(result);
    }
}
