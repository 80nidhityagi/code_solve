public class MedianOfTwoSortedArr {
    public static void main(String[] args) {
        int arr[]={1,3};
        int arrT[]={2,4};
        int res[]=new int[arr.length+arrT.length];
        //i--->arr   j----->arrT       k---->res
        int i=0,j=0,k=0;
        while(i<arr.length&&j<arrT.length){
            if(arr[i]<=arrT[j]){
                 res[k]=arr[i];
                 i++;
                 k++;
            }
            else{
                res[k]=arrT[j];
                j++;
                k++;
            }
        }
        while(i<arr.length||j<arrT.length){
            if(i<arr.length){
            res[k]=arr[i];
            i++;}
              else{
                res[k++]=arrT[j];
                j++;
            }
            k++;
        }
        for(int ele:res){
            System.out.print(ele+" ");
        }
    }
}
