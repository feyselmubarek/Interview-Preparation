class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        goToLeft(res, 0, 0, 1, n);
        return res;
    }
    
    public void goToLeft(int[][] res, int curr, int row, int val, int n){
        if(val > n * n) return;
        
        while(curr < n && res[row][curr] == 0){
            res[row][curr] = val;
            val++;
            curr++;
        }
        
        goToDown(res, row + 1, curr - 1, val, n);
    }
    
    public void goToDown(int[][] res, int curr, int col, int val, int n){
        if(val > n * n) return;
        
        while(curr < n && res[curr][col] == 0){
            res[curr][col] = val;
            val++;
            curr++;
        }
        
        goToRight(res, col - 1, curr - 1, val, n);
    }
    
    public void goToRight(int[][] res, int curr, int row, int val, int n){
        if(val > n * n) return;
        
        while(curr >= 0 && res[row][curr] == 0){
            res[row][curr] = val;
            val++;
            curr--;
        }
        
        goToUp(res, row - 1, curr + 1, val, n);
    }
    
    public void goToUp(int[][] res, int curr, int col, int val, int n){
        if(val > n * n) return;
        
        while(curr >= 0 && res[curr][col] == 0){
            res[curr][col] = val;
            val++;
            curr--;
        }
        
        goToLeft(res, col + 1, curr + 1, val, n);
    }
}