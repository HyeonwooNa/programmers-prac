import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] blackboard = new char[5][];
        int maxLength = 0;

        for (int i = 0; i < blackboard.length; i++) {
            char[] charArray = br.readLine().toCharArray();
            blackboard[i] = charArray;
            
            maxLength = Math.max(maxLength, charArray.length);
        }

        int index = 0;

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < blackboard.length; j++) {
                boolean safe = (i < blackboard[j].length);

                if (safe) {
                    bw.write(blackboard[j][i]);
                }

            }
        }

        bw.flush();
        br.close();
        bw.close();

    }
}
