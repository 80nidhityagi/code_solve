
import java.util.Scanner;
public class SequanceOfString {
    static void seqofint(String s,String currentAns){
     if(s.length()<=0){
        System.out.println(currentAns);
        return;
     }
     char c=s.charAt(0);
    seqofint(s.substring(1), currentAns+c);
     seqofint(s.substring(1),currentAns);
    }

    public static void main(String[] args) {
        System.out.println("enter your string");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        seqofint(s," ");
       sc.close();

    }
}
