class Solution {
    public int solution(int n) {
        
        if (n % 6 == 0) {
            return n / 6;
        } else {
            int answer = 0;
            int num = n;
            boolean repeat = true;
            
            while(repeat) {
                if (num % 6 == 0) {
                    answer = num / 6;
                    repeat = false;
                } else {
                    answer += 1;
                    num += n;
                }
            }
            
            return answer;
        }
        
    }
}