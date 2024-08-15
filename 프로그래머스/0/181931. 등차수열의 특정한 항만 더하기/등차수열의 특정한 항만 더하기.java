class Solution {
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int[] intArr = new int[included.length];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (i * d) + a;

            if (included[i]) {
                sum += intArr[i];
            }
        }

        return sum;
    }
}