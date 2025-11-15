import java.util.*;
public class fibbonaci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The fibonaci is as follows:");
        fibo(num);
    }
    public static void fibo(int n){
       int n1 = 0, n2 = 1;
       for(int i=1;i<=n;i++){
         System.out.print(n1 + " ");
         int n3 = n1+n2;
         n1 = n2;
         n2 = n3;
       }
    }
}