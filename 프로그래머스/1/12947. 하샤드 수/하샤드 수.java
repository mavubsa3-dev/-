class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int result = 0;
        int num = x;
        while (x > 0){
            result += x % 10;
            x /= 10;
        }
        if(num % result != 0){
            answer = false;
        }
        return answer;
    }
}