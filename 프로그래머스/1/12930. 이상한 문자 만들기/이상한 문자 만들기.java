class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            char temp = s.charAt(i);
            if(temp == ' '){
                answer += " ";
                idx = 0;
            }else{
                if(idx % 2 == 0){
                answer += s.valueOf(temp).toUpperCase();
                }else{
                answer += s.valueOf(temp).toLowerCase();
                }
                idx ++;
            }        
        }
        return answer;
    }
}