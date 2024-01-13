import java.io.*;
import java.util.*;

/* DNA 비밀번호 */
public class Main {
  static int myArr[];
  static int checkArr[];
  static int checkSecret;

  public static void main (String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int s = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    int count = 0;
    char arr[] = new char[s];
    checkArr = new int[4];
    myArr = new int[4];
    checkSecret = 0;
    arr = br.readLine().toCharArray();

    // 암호 조건 배열로 받ㅇ아오기
    st = new StringTokenizer(br.readLine());
    for (int i = 0 ; i < 4 ; i++) {
      checkArr[i] = Integer.parseInt(st.nextToken());
      if (checkArr[i] == 0) {
        checkSecret += 1;
      }
    }

    // P 부분 문자열 처리
    for (int i = 0 ; i < p ; i++) {
      Add(arr[i]);
    }
    if (checkSecret == 4) {
      count += 1;
    }

    // 슬라이딩 윈도우 처리
    for (int i = p ; i < s ; i++) {
      int j = i - p;
      Add(arr[i]);
      Remove(arr[j]);
      if (checkSecret == 4) {
        count += 1;
      }
    }

    System.out.println(count);
    br.close();

  }

  // 새로 들어온 문자를 처리하는 함수
  private static void Add (char c) {
    switch (c) {
      case 'A' :
        myArr[0]++;
        if (myArr[0] == checkArr[0]) {
          checkSecret += 1;
        }
        break;
      case 'C' :
        myArr[1]++;
        if (myArr[1] == checkArr[1]) {
          checkSecret += 1;
        }
        break;
      case 'G' :
        myArr[2]++;
        if (myArr[2] == checkArr[2]) {
          checkSecret += 1;
        }
        break;
      case 'T' :
        myArr[3]++;
        if (myArr[3] == checkArr[3]) {
          checkSecret += 1;
        }
        break;
    } 
  }

  // 제거되는 문자를 처리하는 함수
  private static void Remove (char c) {
    switch (c) {
      case 'A' :
        if (myArr[0] == checkArr[0]) {
          checkSecret -= 1;
        }
        myArr[0]--;
        break;
      case 'C' :
        if (myArr[1] == checkArr[1]) {
          checkSecret -= 1;
        }
        myArr[1]--;
        break;
      case 'G' :
        if (myArr[2] == checkArr[2]) {
          checkSecret -= 1;
        }
        myArr[2]--;
        break;
      case 'T' :
        if (myArr[3] == checkArr[3]) {
          checkSecret -= 1;
        }
        myArr[3]--;
        break;
    } 
  }
}