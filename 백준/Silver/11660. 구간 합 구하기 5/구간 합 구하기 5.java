import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    // N X N 배열 만드기
    int arr[][] = new int[n + 1][n + 1];
    for (int i = 1 ; i <= n ; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1 ; j <= n ; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    // 구간 합으로 N X N 배열 만들기
    int dp[][] = new int[n + 1][n + 1];
    for (int i = 1 ; i <= n ; i++) {
      for (int j = 1 ; j <= n ; j++) {
        dp[i][j] = dp[i][j - 1] + dp[i - 1][j] - dp[i - 1][j - 1] + arr[i][j];
      }
    }

    // 구간 합 배열을 이용하여 정답 도출
    for (int i = 0 ; i < m ; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      int result = dp[x2][y2] - dp[x1 - 1][y2] - dp[x2][y1 - 1] + dp[x1 - 1][y1 - 1];
      System.out.println(result);
    }

  }
}