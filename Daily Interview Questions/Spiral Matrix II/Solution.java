class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int tBound = 0, rBound = n - 1, dBound = n - 1, lBound = 0, curr = 1;
        
        while(tBound <= dBound && lBound <= rBound){
            for(int col = lBound; col <= rBound; col++)
                res[tBound][col] = curr++;    
            tBound++;
            
            for(int row = tBound; row <= dBound; row++)
                res[row][rBound] = curr++;
            rBound--;
            
            for(int col = rBound; col >= lBound; col--)
                res[dBound][col] = curr++;
            dBound--;
            
            for(int row = dBound; row >= tBound; row--)
                res[row][lBound] = curr++;
            lBound++;
        }
        
        return res;
    }
}