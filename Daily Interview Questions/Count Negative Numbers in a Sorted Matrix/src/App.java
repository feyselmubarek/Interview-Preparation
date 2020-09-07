public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public int countNegatives(int[][] grid) {
        int count = 0, rowLimit = grid.length, colLimit = grid[0].length;
        
        for(int row = 0; row < rowLimit; row++){
            int left = 0, right = colLimit - 1;
            int leftMost = colLimit;
            
            while(left <= right){
                int mid = left + ((right - left) / 2);
                
                if(grid[row][mid] < 0){
                    leftMost = Math.min(leftMost, mid);
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            
            if(leftMost == colLimit){
                continue;
            }
            
            count += (rowLimit - row) * (colLimit - leftMost);
            colLimit = leftMost;           
            
            if(leftMost == 0){
                return count;
            }
        }
        
        return count;
    }
}
