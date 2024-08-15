class Solution {
    public int solution(int[] num_list) {
        int counter = 0;

        for (int i = 0; i < num_list.length; i++) {
            int tmp = num_list[i];
            while (tmp != 1) {
                tmp = (tmp % 2 == 0) ? (tmp / 2) : ((tmp - 1) / 2);
                counter++;
            }
        }
        
        return counter;
    }
}