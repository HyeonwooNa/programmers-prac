import java.util.*;
class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString.replace("x", " "));
        String[] answer = new String[st.countTokens()];
        int index = 0;
        
        while(st.hasMoreTokens()) {
            answer[index++] = st.nextToken();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}