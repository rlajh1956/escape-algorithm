import java.util.*;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1541
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] splitMinus = str.split("-");
        int sum = 0;
        int operator = 1;
        for (String s : splitMinus) {
            String[] splitPlus = s.split("[+]");
            for (String plus : splitPlus) {
                sum += Integer.parseInt(plus) * operator;
            }
            operator = -1;
        }

        System.out.println(sum);
    }
}