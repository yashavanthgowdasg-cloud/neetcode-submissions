class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> NoDuplicates = new HashSet<>();

        for (int i :nums){
            if(!NoDuplicates.add(i)){
                return true;
            }
        }
        return false;
}

}