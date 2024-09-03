class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int[][] matrix = new int[len][n];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = num_list[index++];
            }
        }

        return matrix;
    }
}