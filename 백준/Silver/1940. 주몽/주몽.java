import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());

    // 입력 값 배열러 만들기
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[n];
    for (int i = 0 ; i < n ; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    int count = 0 ;
    int start = 0;
    int end = n - 1;
    while (start < end) {
      if (arr[start] + arr[end] < m) {
        start += 1;
      } else if (arr[start] + arr[end] > m) {
        end -= 1;
      } else {
        count += 1;
        start += 1;
        end -= 1;
      }
    }

    System.out.println(count);
    br.close();

  }
}