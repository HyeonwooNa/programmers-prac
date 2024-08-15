class Solution {
    public static int solution(int i, int j, int k) {
        int counter = 0;
        String tmp = "";

        for (int m = i; m <= j; m++) {
            tmp = tmp.concat(String.valueOf(m));
        }

        for (int m = 0; m < tmp.length(); m++) {
            if (tmp.charAt(m) == (k+'0')) {
                counter++;
            }
        }

        return counter;
    }
}