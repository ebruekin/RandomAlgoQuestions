public class Longestsum{
    public int LongestS(int[] nums,int k){
        int i=0;
        int sum=0;
        int len=0;

        for(int j=0;j<nums.length;j++){
            sum = sum+nums[j];

            while(sum > k){
                sum = sum - nums[i];
                i++;
            }
            len = Math.max(len,j-i+1);
        }
        return len;
    }
}