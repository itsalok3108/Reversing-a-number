import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a= sc.nextInt();
        while (a>0){
            int b=a%10;
            System.out.print(b);
            a/=10;
        }
    }
}
