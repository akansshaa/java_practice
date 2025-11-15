import java.util.Scanner;

public class compare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int n1 = sc.nextInt();
        System.out.print("enter second number:");
        int n2 = sc.nextInt();
        System.out.print("enter third number:");
        int n3 = sc.nextInt();
        sc.close();
        if(n1>n2){
            if(n1>n3){
                System.out.println("first number is greatest");
            }
            else{
                System.out.println("third number is greatest");
            }
        }
        System.out.println("second number is greatest");
    }
}