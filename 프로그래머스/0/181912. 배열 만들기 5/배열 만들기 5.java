class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int index = 0;
        int[] tmpArr = new int[intStrs.length];
        
        for (int i = 0; i < intStrs.length; i++) {
            int tmp = Integer.parseInt(intStrs[i].substring(s, s+l));
            if (tmp > k) {
                tmpArr[index++] = tmp;
            }
        }
        
        int[] result = new int[index];
        
        for (int i = 0; i < result.length; i++) {
            result[i] = tmpArr[i];
        }
        
        return result;
    }
}