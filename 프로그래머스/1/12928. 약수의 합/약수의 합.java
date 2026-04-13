class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int m=1; m<=n; m++){
            if(n % m == 0){
                answer += m;
            }
        }
        return answer;
    }
}