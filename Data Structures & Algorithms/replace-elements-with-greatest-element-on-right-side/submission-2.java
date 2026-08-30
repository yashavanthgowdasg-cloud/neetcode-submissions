class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int j=i+1;
           if(j<arr.length) {
               int tempMax = arr[i + 1];
               while (j < arr.length) {
                   if (arr[j] >= tempMax) {
                       tempMax = arr[j];
                       arr[i] = tempMax;
                   }

                   j++;
               }
           }
           else{
           arr[i] =-1;
           }
        }
        return arr;
    }
}