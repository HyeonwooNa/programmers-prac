class Solution {
    public String solution(String s) {
        int[] alphabet = new int[26];
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            alphabet[charArr[i] - 'a']++;
        }

        String answer = "";

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == 1) {
                answer = answer.concat(String.valueOf((char)(i + 'a')));
            }
        }

        return answer;
    }
}