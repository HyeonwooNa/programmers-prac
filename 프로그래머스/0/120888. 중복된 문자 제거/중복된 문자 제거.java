class Solution {
    public String solution(String my_string) {
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] == charArr[j]) {
                    charArr[j] = '1';
                }
            }
        }
        
        return new String(charArr).replace("1", "");
    }
}