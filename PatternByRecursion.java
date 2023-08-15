public class PatternByRecursion {
    static void row(int row,int i){
        if(i>row){
            return;
        }
       col(i,1);
       System.out.println();
       row(row,i+1);
    }
    static void col(int i,int j) {
        if(j>i){
        return;
        }
        System.out.print("*"+" ");
        col(i,j+1);
    }
    public static void main(String[] args) {
        row(4, 1);
    }
}
