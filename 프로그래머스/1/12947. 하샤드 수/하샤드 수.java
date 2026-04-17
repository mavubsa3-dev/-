class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] s = String.valueOf(x).split("");
        int sum = 0;
        for(String str : s){
            sum += Integer.parseInt(str);
        }
        
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    }
}