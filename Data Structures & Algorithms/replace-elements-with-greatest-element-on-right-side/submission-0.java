class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int []temp = new int[(arr.length-1)-i];
            int k=0;
            for(int j=i+1;j<arr.length;j++){
                temp[k] = arr[j];
                k++;
            }
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