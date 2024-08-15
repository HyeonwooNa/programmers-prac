class Solution {
    public static int solution(int n) {
        int counter = 0;
        int tmpCounter = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    tmpCounter += 1;
                    
                    if (tmpCounter >= 3) {
                        counter++;
                        break;
                    }
                    
                }
                
            }
            tmpCounter = 0;
        }
        
        return counter;
    }
}