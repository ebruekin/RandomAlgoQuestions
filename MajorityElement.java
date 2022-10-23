public class MajorityElement{

    public void finMajority(int[] arr,int n){
        int maxCount=0;
        int index=-1;
        
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]) count++;                    
            }

            //update maxCount if count of current element is greater
            if(count > maxCount){
                maxCount = count;
                index = i;
            }
        }

        if(maxCount > n/2) System.out.println(arr[index]);
        else System.out.println("No majority element");
    }
}