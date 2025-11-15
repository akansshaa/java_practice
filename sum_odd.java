import java.util.*;
public class sum_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.print("Sum of all odd numbers: "+ sum(num));
    }
    public static int sum(int num){
        int s = 0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                s+=i;
            }
        }
        return s;
    }
}
