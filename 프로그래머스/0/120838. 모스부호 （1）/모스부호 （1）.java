class Solution {
    public static String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] eachLetter = letter.split(" ");
        char[] letterArray = new char[eachLetter.length];

        for (int i = 0; i < eachLetter.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (eachLetter[i].equals(morse[j])) {
                    letterArray[i] = (char)('a' + j);
                }
            }
        }

        return new String(letterArray);
    }
}