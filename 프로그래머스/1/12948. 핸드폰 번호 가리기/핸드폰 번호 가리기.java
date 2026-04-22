import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] number = phone_number.split("");
        for(int i=0; i<=number.length - 5; i++){
            number[i] = "*";
        }
       
        return String.join("", number);
    }
}