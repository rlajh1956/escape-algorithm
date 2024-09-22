import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N + 1];
        for (int i = 1; i < N + 1; i++) {
            visited[i] = false;
        }
        dfs(0);
    }

    private static void dfs(int index) {
        if (index == M) {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[arr.length - 1]);
            return;
        }
        for (int i = 1; i <= N; i++) {
            if (visited[i]) {
                continue;
            }
            arr[index] = i;
            visited[i] = true;
            dfs(index + 1);
            visited[i] = false;
        }
    }
}