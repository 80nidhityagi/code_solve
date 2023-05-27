public class Hcf {
    static int hcf(int divisor,int dividend){
        int  rem=dividend%divisor;
        if(rem==0){
            return divisor;
        }
        return hcf(rem,divisor);

      
    }
    public static void main(String[] args) {
        int x=11,y=22;
       System.out.println(hcf(x,y));
    }
}
