import java.util.Scanner;
public class BasicSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basic salary");
         float basic_salary=sc.nextFloat();
         float hra=(basic_salary*30)/100;
          float ta=(basic_salary*20)/100;
          float da=(basic_salary*10)/100;
          float netSalary=basic_salary+hra+da+ta-1500;
          System.out.println("net salary is:"+" "+netSalary);
          

    }
}
