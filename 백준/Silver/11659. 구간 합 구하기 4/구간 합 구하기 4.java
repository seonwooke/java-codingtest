import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int arr[] = new int[n + 1];

    // 합 배열 구하기
	st = new StringTokenizer(br.readLine());
    for (int i = 1 ; i <= n ; i++) {
      arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
    }

    // 구간 합 구하기
    for (int i = 0 ; i < m ; i++) {
      st = new StringTokenizer(br.readLine());
      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      System.out.println(arr[end] - arr[start - 1]);
    }
    
  }
}