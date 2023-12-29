import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int centerValue = array.length / 2;
        
        int answer = array[centerValue];
        return answer;
    }
}