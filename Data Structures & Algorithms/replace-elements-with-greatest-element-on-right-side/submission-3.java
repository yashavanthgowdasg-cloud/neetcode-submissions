class Solution {
    public int[] replaceElements(int[] arr) {
         for(int i=0;i<=arr.length-1;i++){
            if(i<arr.length-1){
            arr[i] = arr[i+1];
            for(int j=i+2;j<arr.length;j++){

                if(arr[j]>=arr[i]){
                    arr[i] = arr[j];
                }
            }
        }
            else{
                arr[i] = -1;
                return arr;
            }
        }
        return arr;

    }
}