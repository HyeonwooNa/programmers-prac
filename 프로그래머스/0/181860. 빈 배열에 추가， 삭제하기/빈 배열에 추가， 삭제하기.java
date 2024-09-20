class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        String tmp = "";

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    tmp += String.valueOf(arr[i]);
                }
            } else {
                tmp = tmp.substring(0, tmp.length() - arr[i]);
            }
        }
        
        String[] tmpArr = tmp.split("");
        answer = new int[tmpArr.length];

        for (int i = 0; i < tmpArr.length; i++) {
            answer[i] = Integer.parseInt(tmpArr[i]);
        }

        return answer;
    }
}