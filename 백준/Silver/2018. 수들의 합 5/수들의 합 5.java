import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int count = 1; // n인 경우 포함하고 시작
    int start = 1;
    int end = 1;
    int sum = 1;

    while (end != n) {
      if (sum == n) {
        count += 1;
        end += 1;
        sum += end;
      } else if (sum > n) {
        sum -= start; 
        start += 1;
      } else {
        end += 1;
        sum += end;
      }
    }

    System.out.println(count);

  }
}