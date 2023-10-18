import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num>0){
        num=num/10;
        count++;
        }
        System.out.println(count);
        sc.close();
    }
}
