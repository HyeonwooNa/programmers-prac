import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rowAndColumn = br.readLine().split(" ");

        int row = Integer.parseInt(rowAndColumn[0]);
        int column = Integer.parseInt(rowAndColumn[1]);

        int[][] matrixA = createMatrix(br, row, column);
        int[][] matrixB = createMatrix(br, row, column);

        br.close();

        printMatrixSum(matrixA, matrixB);
    }

    private static int[][] createMatrix(BufferedReader br, int row, int column) throws IOException {
        int[][] matrix = new int[row][column];

        for (int i = 0; i < matrix.length; i++){
            int j = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                matrix[i][j++] = Integer.parseInt(st.nextToken());
            }
        }

        return matrix;
    }

    private static void printMatrixSum(int[][] matrixA, int[][] matrixB) {
        int sum = 0;
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                sum = matrixA[i][j] + matrixB[i][j];
                System.out.print(sum);
                if (j != matrixA[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
