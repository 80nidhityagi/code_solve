import java.util.Scanner;
public class VowelCon {
    public static void main(String[] args) {
        System.out.println("enter character");
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("entered char is a vowel");
        }
        else{
            System.out.println("entered char is a consonant");
        }
    }
}
