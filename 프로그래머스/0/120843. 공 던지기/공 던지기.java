class Solution {
    public int solution(int[] numbers, int k) {
        int index = 1;
        int limit = numbers.length;

        for (int i = 0; i < k - 1; i++) {
            index += 2;

            if (index >= limit) {
                index = index - limit;
            }

        }
        
        if (index == 0) {
            return numbers[numbers.length-1];
        } else return index;
    }
}