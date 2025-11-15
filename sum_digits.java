import java.util.*;
public class sum_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int n1 = sc.nextInt();
        sc.close();
        System.out.print("Sum of digits of a number: "+sum(n1));
    }
    public static int sum(int num){
        int s = 0;
        for(int i=0;i<=num;i++){
            int r = num%10;
            s+=r;
            num = num/10;
        }
        return s;
    }
}
