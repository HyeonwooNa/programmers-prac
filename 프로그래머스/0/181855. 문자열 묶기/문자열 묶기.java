import java.util.HashMap;
import java.util.Map;

class Solution {

    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }

        int max = 0;

        for (Integer key : map.keySet()) {
            int value = map.get(key);
            max = Math.max(max, value);
        }
        
        return max;
    }
}