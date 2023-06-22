public class RemoveAFromStringRecursion {
       static String removeA(String s,int idx){
        if(idx>=s.length()){
            return " ";
        }
        String smallans=removeA(s, idx+1);
        if(s.charAt(idx)!='a')
        return  s.charAt(idx)+smallans;
        else
        return smallans;
       }
    public static void main(String[] args) {
        String s="aaasa";
        String ans=removeA(s,0);
        System.out.println(ans);
    }
}
