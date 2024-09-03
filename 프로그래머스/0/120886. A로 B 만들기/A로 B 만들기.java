class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        for (int i = 0; i < beforeArr.length; i++) {
            for (int j = 0; j < afterArr.length; j++) {
                if (beforeArr[i] == afterArr[j]) {
                    afterArr[j] = ' ';
                    break;
                }
            }
        }

        if(new String(afterArr).trim().isEmpty()){
            return 1;
        } else {
            return 0;
        }
    }
}