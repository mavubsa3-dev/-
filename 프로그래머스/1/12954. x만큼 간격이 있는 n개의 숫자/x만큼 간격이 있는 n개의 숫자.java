class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(x >= -10000000 && x <= 10000000 && n <= 1000){
           long sum = 0;
            for(int i=0; i<answer.length; i++){
                sum += x;
                answer[i] = sum;
            }
        }
        return answer;
    }
}