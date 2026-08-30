class Solution {
    public int[] replaceElements(int[] arr) {
          int maxRight  = arr[arr.length-1];
        arr[arr.length-1] = -1;

        //[2,4,5,3,1,2]

        for(int i=arr.length-2;i>=0;i--){
            int currentVal = arr[i];
            arr[i] = maxRight;
            maxRight= Math.max(maxRight, currentVal);

        }
        return arr;
    }
}