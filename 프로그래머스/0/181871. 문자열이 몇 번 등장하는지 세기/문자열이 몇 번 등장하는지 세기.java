class Solution {
    public int solution(String myString, String pat) {
        int counter = 0;
        int startIndex = myString.indexOf(pat);

        for (int i = 0; i < myString.length(); i++) {
            if (startIndex != -1) {
                startIndex = myString.indexOf(pat, startIndex + 1);
                counter++;
            }
        }

        return counter;
    }
}