class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (97 <= c) {
                answer[c - 'a' + 26]++;
            } else {
                answer[c - 'A']++;
            }

        }

        return answer;
    }
}