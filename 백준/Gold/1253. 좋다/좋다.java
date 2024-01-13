import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    // 입력 값 배열로 만들기
    StringTokenizer st = new StringTokenizer(br.readLine());
    long[] arr = new long[n];
    for (int i = 0 ; i < n ; i++) {
      arr[i] = Long.parseLong(st.nextToken());
    }
    Arrays.sort(arr);

    int count = 0;
    for (int k = 0 ; k < n ; k++) {
      long good = arr[k];
      int start = 0;
      int end = n - 1;

      while (start < end) {
        if (arr[start] + arr[end] == good) {
          if (start != k && end != k) {
            count += 1;
            break;
          } else if (start == k) {
            start += 1;
          } else if (end == k) {
            end -= 1;
          }
        } else if (arr[start] + arr[end] < good) {
          start += 1;
        } else {
          end -= 1;
        }
      }
    }

    System.out.println(count);
    br.close();

  }
}