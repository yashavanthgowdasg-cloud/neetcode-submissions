class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> NewSet = new HashSet<>();

        for(int i =0; i<nums.length;i++){
            NewSet.add(nums[i]);
        }
    if(NewSet.size()<nums.length){
        return true;
    }

    return false;
    
    }
}