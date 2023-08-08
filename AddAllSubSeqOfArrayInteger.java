public class AddAllSubSeqOfArrayInteger {
    static void subSeq(int arr[],int idx,int CA){
        if(idx>arr.length-1){
            System.out.println(CA);
            return;
        }
     subSeq(arr,idx+1,CA+arr[idx]);
     subSeq(arr,idx+1,CA);

    }
    public static void main(String[] args) {
        int arr[]={2,4,5};
        
        subSeq(arr,0,0);
    }
}
