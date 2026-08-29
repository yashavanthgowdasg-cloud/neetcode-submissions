class Solution {
    public boolean hasDuplicate(int[] nums) {
     Set<Integer> NewSet = new HashSet<>();

        for(int i:nums){
            if(NewSet.contains(i)){
                return true;
            }
            NewSet.add(i);
        }
    return false;
}

}