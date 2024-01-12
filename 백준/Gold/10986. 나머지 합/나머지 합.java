import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    long[] s = new long[n];
    long[] c = new long[m];
    long count = 0;

    // 합 배열 만들기
    st = new StringTokenizer(br.readLine());
    s[0] = Integer.parseInt(st.nextToken());
    for (int i = 1 ; i < n ; i++) {
      s[i] = s[i - 1] + Integer.parseInt(st.nextToken());
    }

    // 합 배열에 % m 하기
    for (int i = 0 ; i < n ; i++) {
      int remainder = (int) (s[i] % m);
      if (remainder == 0) {
        count += 1;
      } 
      c[remainder] += 1;
    }

    // 나머지가 같은 수를 더하기
    for (int i = 0 ; i < m ; i++) {
      if (c[i] > 1) {
        count += (c[i] * (c[i] - 1) / 2);
      }
    }

    System.out.println(count);

  }
}