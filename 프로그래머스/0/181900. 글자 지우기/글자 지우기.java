class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArr = my_string.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            charArr[indices[i]] = '1';
        }

        return new String(charArr).replace("1", "");
    }
}