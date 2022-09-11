import java.util.Scanner;

public class Reverse2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a= sc.nextInt();
        int ans=0;
        while (a>0){
            int b=a%10;
            a/=10;
            ans= ans*10+b;
        }
        System.out.print(ans);
    }
}