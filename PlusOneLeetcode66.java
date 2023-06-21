public class PlusOneLeetcode66 {
    static int[] fun(int arr[],int n){
        int cy=n;
        int  arr1[]=new int[cy+2];
        if(arr[n]==9)
        {
         while(n>=0&&arr[n]==9)
         {
            arr[n]=0;
            n=n-1;
         }
         if(n<0){
            arr1[0]=1;

         for(int i=1;i<arr1.length;i++){
             arr1[i]=0;
         }
         return arr1;
        }
        else{
            arr[n]=arr[n]+1;
            return arr;
        }
        }
        else{
            arr[n]=arr[n]+1;
            return arr;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,9,9};
        int n=arr.length-1;
        int res[]=fun(arr,n);
        for(int ele:res)
        System.out.print(ele+" ");
}
}
