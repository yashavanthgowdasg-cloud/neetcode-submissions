class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> NewSet = new HashSet<>();

        for(int num :nums){

            if(!NewSet.add(num)){
                return true;
            }
        }
        return false;
    }
}
