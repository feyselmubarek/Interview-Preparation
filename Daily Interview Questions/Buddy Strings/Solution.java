class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()){
            return false;
        }   
        
        int maxRep = 0, diff = 0, lastIdx = -1;
        int[] map = new int[26];
        
        for(int idx = 0; idx < A.length(); idx++){
            char _a = A.charAt(idx);
            char _b = B.charAt(idx);
            
            if(_a == _b){
                map[(int) (_a - 97)]++;
                maxRep = Math.max(maxRep, map[(int) (_a - 97)]);
            }else {
                if(lastIdx == -1){
                    lastIdx = idx;
                }else if(diff == 2 || _a != B.charAt(lastIdx) || _b != A.charAt(lastIdx)){
                    return false;
                }
                
                diff++; 
            }
        }
        
        if(diff == 2){
            return true;
        }
        
        return diff == 1 ? false : maxRep > 1;        
    }
}