import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ist number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        System.out.println("1 addition\n 2 subtaraction \n 3 multiplication\n 4 division");
        System.out.println("enter the operation which you want to perform");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("the result will be:"+(n1+n2));
            break;
            case 2:
             System.out.println("the result will be:"+(n1-n2));
            break;
            case 3:
             System.out.println("the result will be:"+(n1*n2));
            break;
            case 4:
             System.out.println("the result will be:"+(n1/n2));
            break;
               default:
               System.out.println("you enter wrong operation"); 
        }
sc.close();

    }
}
