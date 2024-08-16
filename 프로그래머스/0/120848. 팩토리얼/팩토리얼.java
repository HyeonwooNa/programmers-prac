class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 10; i++) {
            int tmp = factorial(i);
            
            if (tmp <= n) {
                answer = i;
            }
            
        }

        return answer;
    }

    public int factorial(int n) {
        if(n == 1) return 1;
        return n * factorial(n - 1);
    }
}