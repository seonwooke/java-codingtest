import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        // 초기 세팅
        int answer = 0;
        int maxValue = 0;
        Arrays.sort(array);
        maxValue = array[array.length - 1];
        
        int count[] = new int[maxValue + 1];
        for (int i = 0 ; i < array.length ; i++) {
            count[array[i]]++;
        }
        
        // 최빈값 찾기
        maxValue = count[0];
        for (int i = 1 ; i < count.length ; i++) { 
            if (maxValue < count[i]) {
                maxValue = count[i];
                answer = i;
            } else if (maxValue == count[i]) {
                answer = -1;
            }
        }
        
        return answer;
    }
}