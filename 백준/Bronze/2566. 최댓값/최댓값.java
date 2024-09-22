import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] matrix = new int[9][9];
        int max = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < s.length; j++) {
                int val = Integer.parseInt(s[j]);

                if (val > max) {
                    max = val;
                    matrix[i][j] = val;
                }
            }

        }

        bw.write(max + "\n");
        bw.write(findIndex(matrix, max));
        bw.flush();
        bw.close();
        br.close();
    }

    private static String findIndex(int[][] arr, int a) {
        String s = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == a) {
                    s = (i+1) + " " + (j+1);
                }
            }
        }

        return s;
    }

}
