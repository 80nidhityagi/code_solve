import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        int bal=2000;
          int money;
          char s='y';
        // System.out.println("enter the choice you want to start loop write yes if you want or no if not want");
         Scanner sc=new Scanner(System.in);
        // String loopV=sc.nextLine();
do{
    System.out.println("enter the choice \n 1 check the balance \n 2 deposit money  \n 3 withdraw the money");
        int ch=sc.nextInt();
switch(ch){
    case 1: System.out.println("your current balance"+ bal); 
                     break;
    case 2: System.out.println("enter the money you want to       deposit"); 
             money=sc.nextInt();
            bal+=money;
            System.out.println("your current balace is "+bal);
            break;
    case 3: System.out.println("enter the money you want to withdraw");
           int  moneyWithdraw=sc.nextInt();
            if(moneyWithdraw>bal){
            System.out.println("you cannot withdraw");
            break;
            }
            else{
            bal-=moneyWithdraw;
            System.out.println("your current balance"+bal);
            }
            break;
  default:   System.out.println("you choose not apporiate option ");
        }
        System.out.println("you want to continue");
        s=sc.next().charAt(0);
        
    }while(s=='y');
        sc.close();
    }
}
