import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first num: ");
        int n1 = sc.nextInt();
        System.out.print("enter second num: ");
        int n2 = sc.nextInt();
        sc.close();
        int result = find_gcd(n1,n2);
        System.out.print("gcd of given two numbers: "+result);
    }
    public static int find_gcd(int n1,int n2){
        int gcd = 1;
        int least = least(n1,n2);
        for(int i =1;i<=least;i++){
            if(n1%i==0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static int least(int n1,int n2){
        if(n1<n2){
            return n1;
        }
        else{
            return n2;
        }
    }
}
