public class Leetcode_154 {
    static int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
         int i=nums.length-1;

            while(i>=0&&nums[i]<=min){
               min=nums[i]; 
               i=i-1;
               
            } 
            return min;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,5};
        int result=findMin(nums);
        System.out.println("minimum element in rotated array is:"+result);
        
        }
    }

