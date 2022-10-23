public class Main{
    public static void main(String[] args) {
        // LongestSum
        Longestsum l = new Longestsum();

        int[] nums = {3, 1, 2, 7, 4, 2, 1, 1, 5};
        System.out.println(l.LongestS(nums, 8));

        // Max Consecutive Ones
        MaxConsecutive m = new MaxConsecutive();
        int[] arr = {1,1,0,1,1,0,0,1,1,1};
        System.out.println(m.MaxCons(arr));

        //remove duplicates
        RemoveDuplicates r = new RemoveDuplicates();

        int[] arr1 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(r.removeDup(arr1));

        MajorityElement x = new MajorityElement();
        int[] arr2 = { 1, 1, 2, 1, 3, 5, 1};
        x.finMajority(arr2, 7);
       
    }
}