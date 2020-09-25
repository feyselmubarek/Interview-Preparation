public class Solution{
    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            recursePermute(nums, i, set, curr, res);
        }
        
        return res;
    }
    
    public void recursePermute(
        int[] nums, int index, HashSet<Integer> set, List<Integer> curr, List<List<Integer>> res
    ) {
        set.add(nums[index]);
        curr.add(nums[index]);
        
        if(set.size() == nums.length){
            List<Integer> mainList = new ArrayList<Integer>();
            mainList.addAll(curr);
            res.add(mainList);
            
            set.remove(nums[index]);
            curr.remove(curr.size() - 1);
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i != index && !set.contains(nums[i])){
                recursePermute(nums, i, set, curr, res);
            }
        }
        
        set.remove(nums[index]);
        curr.remove(curr.size() - 1);
    }
}