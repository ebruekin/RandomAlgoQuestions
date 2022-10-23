public class MaxConsecutive {
    public int MaxCons(int[] arr){
        int count = 0;
        int result = 0;

        for(int i=0;i<arr.length;i++){
            //reset count when 0 is found

            if(arr[i] == 0){
                count = 0;
            }else{
                //if 1 is found , increment count and update result if count becomes more
                count++;
                result = Math.max(result,count);
            }
        }
        return result;
    }
}
