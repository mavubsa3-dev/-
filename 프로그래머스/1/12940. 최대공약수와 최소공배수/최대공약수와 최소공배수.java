class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num1 = n;
        int num2 = m;
        int temp = 0;
        int div = 0;
        if(n < m){
            temp = n;
            n = m ;
            m = temp;
        }
        while(n % m != 0){
            div = n % m;
            n = m;
            m = div;
        }
        div = m ;
        int num = num1 * num2 / div;
        answer[0] = div;
        answer[1] = num;
        
        return answer;
    }
}