class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        boolean isSame = false;
        char[] charArr = A.toCharArray();

        if (A.equals(B)) {
            return 0;
        }
        
        for (int i = 0; i < charArr.length; i++) {
            char tmp = charArr[charArr.length - 1];

            for (int j = charArr.length - 2; j >= 0; j--) {
                charArr[j+1] = charArr[j];
            }

            charArr[0] = tmp;

            if (B.equals(new String(charArr))) {
                answer = i + 1;
                break;
            }

        }

        return answer;
    }
}