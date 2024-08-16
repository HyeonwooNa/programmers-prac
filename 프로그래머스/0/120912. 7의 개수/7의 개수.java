class Solution {
    public int solution(int[] array) {
        String tmp = "";
        
        for (int i = 0; i < array.length; i++) {
            tmp = tmp.concat(String.valueOf(array[i]));
        }
        
        char[] charArr = tmp.toCharArray();

        int counter = 0;
        
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '7') {
                counter++;
            }
        }
        
        return counter;
    }
}