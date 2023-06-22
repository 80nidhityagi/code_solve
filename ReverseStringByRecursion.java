public class ReverseStringByRecursion {
    static String reverse(String s,int idx){
        if(idx>=s.length())
        return " ";
       String smallans= reverse(s,idx+1);
       return smallans+s.charAt(idx);
    }
    public static void main(String[] args) {
        String s="antu";
        String ans=reverse(s,0);
        System.out.println(ans);
    }
}
