import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String[] str = Long.toString(n).split("");
        Arrays.sort(str);
        
        StringBuilder sb = new StringBuilder();
        for(String list : str) sb.append(list);
        return Long.parseLong(sb.reverse().toString());
    }
}