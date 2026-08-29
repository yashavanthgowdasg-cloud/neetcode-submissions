class Solution {
    public boolean isAnagram(String s, String t) {
    Map<Character, Integer> newMap  = new HashMap<>();

       for(Character c: s.toCharArray()){
           newMap.put(c, newMap.getOrDefault(c,0)+1);
       }

        for(Character c: t.toCharArray()){
            newMap.put(c, newMap.getOrDefault(c,0)-1);
        }

        for(Integer i :newMap.values()){
                if(i!=0){
                    return false;
                }
        }
       return true;
    }
}
