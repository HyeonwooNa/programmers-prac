class Solution {
    public int[] solution(int n) {
        int counter = 1;
        int tmp = n;

        while(true) {
            if (n == 1) {
                break;
            }

            if(n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }

            counter++;
        }

        int[] answer = new int[counter];
        answer[0] = tmp;

        int index = 1;

        for (int i = index; i < answer.length; i++) {


            if(tmp % 2 == 0) {
                tmp = tmp / 2;
                answer[index++] = tmp;
            } else {
                tmp = 3 * tmp + 1;
                answer[index++] = tmp;
            }
        }

        return answer;
    }
}