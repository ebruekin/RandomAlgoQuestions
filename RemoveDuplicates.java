public class RemoveDuplicates {
    public int removeDup(int[] arr){
        int n = arr.length;

        int j = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }
}
