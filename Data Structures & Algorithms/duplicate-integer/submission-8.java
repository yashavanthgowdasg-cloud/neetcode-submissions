class Solution {
    public boolean hasDuplicate(int[] nums) {
       Hashtable<Integer, Integer> nd = new Hashtable<>();
        
        for (int i=0;i<nums.length;i++){
            
            if(nd.containsKey(nums[i]) == false){
                nd.put(nums[i],1);
            }
            else{

             return true;
            }
        }
        return false;    
}

}