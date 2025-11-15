import java.util.*;
public class reverse_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("The number before reversing the digits: "+num);
        System.out.println("The number after reversing the digits: "+reverse(num));
    }
    public static int reverse(int num){
        int new_num = 0;
        while(num!=0){
            int r = num%10;
            new_num = new_num*10+r;
            num /=10;
        }
        return new_num;
    }

}
