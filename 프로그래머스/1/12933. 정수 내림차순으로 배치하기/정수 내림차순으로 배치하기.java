class Solution {
    public long solution(long n) {
        long[] answer = new long[Long.toString(n).length()];
        String str = Long.toString(n);
        long result = 0;
        for(int i=0; i<str.length(); i++){
            answer[i] = str.charAt(i) - '0';
        }
        for(int i=0; i<answer.length; i++){
            for(int j=i+1; j<answer.length; j++){
            if(answer[j] > answer[i]){
                long temp = 0;
                temp = answer[i];
                answer[i] = answer[j];
                answer[j] = temp;
            }
          }
        }
        for(int i=0; i<answer.length; i++){
            result = (result * 10) + answer[i];
        }
        return result;
    }
}