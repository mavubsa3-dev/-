import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int minnum = arr[0];
        if(arr.length == 1){
            return new int[]{-1};
        }
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
            if(minnum > arr[i]){
                minnum = arr[i];
            }
        }
        list.remove((Integer)minnum);
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }
}