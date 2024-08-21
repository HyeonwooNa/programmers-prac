class Solution {
    public static int solution(int n) {
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            tmp++;

            while(tmp % 3 == 0 || String.valueOf(tmp).contains("3")) {
                tmp++;
            }

        }

        return tmp;
    }
}
