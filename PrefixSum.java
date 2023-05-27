import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
       sc.close(); 
    }
}
