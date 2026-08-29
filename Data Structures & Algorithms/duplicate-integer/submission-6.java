class Solution {
    public boolean hasDuplicate(int[] nums) {
       Hashtable<Integer, Integer> noDuplicates = new Hashtable<>();
        
        for (int i=0;i<nums.length;i++){
            
            if(noDuplicates.containsKey(nums[i]) == false){
                noDuplicates.put(nums[i],1);
            }
            else return true;
        }
        return false;    
}

}