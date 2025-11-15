import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first num: ");
        int n1 = sc.nextInt();
        System.out.print("enter second num: ");
        int n2 = sc.nextInt();
        sc.close();
        int result = find_lcm(n1,n2);
        System.out.println("lcm of given two numbers: " +result);
    }
    public static int find_lcm(int n1,int n2){
        for(int i=1;i<=n2;i++){
            int factor = n1*i;
            if(factor%n2==0){
                return factor;
            }
        }
        return 0;
    }
}
