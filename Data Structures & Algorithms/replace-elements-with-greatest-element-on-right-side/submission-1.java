class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int temp[] = Arrays.copyOfRange(arr, i+1,arr.length);

            if(i ==arr.length-1){
                arr[i] =-1;
            }
            else {
                Arrays.sort(temp);
                arr[i] = temp[temp.length - 1];
            }
        }
        return arr;
    }
}