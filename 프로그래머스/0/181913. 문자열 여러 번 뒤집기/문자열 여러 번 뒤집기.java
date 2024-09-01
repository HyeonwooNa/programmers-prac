class Solution {
    public static String solution(String my_string, int[][] queries) {
        char[] charArray = my_string.toCharArray();

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            while (start < end) {
                char tmp = charArray[start];
                charArray[start] = charArray[end];
                charArray[end] = tmp;
                start++;
                end--;
            }
        }

        return new String(charArray);
    }
}