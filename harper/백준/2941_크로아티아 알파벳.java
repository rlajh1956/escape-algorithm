import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/2941
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String s : arr) {
            str = str.replace(s, " ");
        }
        System.out.println(str.length());
    }
}