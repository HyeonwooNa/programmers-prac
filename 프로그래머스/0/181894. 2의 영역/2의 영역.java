class Solution {
    public int[] solution(int[] arr) {
        String tmp = "";

        for (int i = 0; i < arr.length; i++) {
            tmp = tmp.concat(String.valueOf(arr[i])).concat(" ");
        }

        if (!tmp.contains("2")) {
            return new int[]{-1};
        }

        int startIndex = tmp.indexOf("2");
        int endIndex = tmp.lastIndexOf("2");

        tmp = tmp.substring(startIndex, endIndex + 1);

        String[] filtered = tmp.split(" ");
        int[] result = new int[filtered.length];

        for (int i = 0; i < filtered.length; i++) {
            result[i] = Integer.parseInt(filtered[i]);
        }

        return result;
    }
}