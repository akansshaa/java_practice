import java.util.*;
public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("-------the multiplication table-------");
        multiplication_table(num);

    }
    public static void multiplication_table(int n){
        int i = 1;
        while(i<=10){
            System.out.println(n+" * "+i +" = "+n*i);
            i++;
        }
    }
}
