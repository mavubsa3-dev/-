class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        if(arr.length >= 1 && arr.length <= 100){
            for(int i=0; i<arr.length; i++){
                answer += arr[i];
            }
        }
           
        return answer / arr.length;
    }
}