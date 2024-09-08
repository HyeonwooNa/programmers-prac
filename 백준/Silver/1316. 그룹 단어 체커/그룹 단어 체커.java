import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iter = Integer.parseInt(br.readLine());
        boolean continueIter = true;

        int counter = 0;


        for (int i = 0; i < iter; i++) {
            String input = br.readLine();
            boolean[] isPrevious = new boolean[26];

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);
                int tmp = ch - 'a';

                if(!isPrevious[tmp]) {
                    isPrevious[tmp] = true;
                } else if(isPrevious[tmp] && j >= 1) {
                    if (ch != input.charAt(j - 1)) {
                        continueIter = false;
                        break;
                    }
                }

            }
            if(continueIter) {
                counter++;
            }

            continueIter = true;
        }

        System.out.println(counter);
    }

}