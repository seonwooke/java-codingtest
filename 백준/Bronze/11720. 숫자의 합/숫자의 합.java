import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine(); // n을 사용하지 않으므로 입력만 받는다

    int sum = 0;
    for (byte value : br.readLine().getBytes()) {
      sum += (value - '0');
    }

    System.out.println(sum);

  }
}