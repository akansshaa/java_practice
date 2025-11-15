import java.util.*;
public class leap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year: ");
        int year = sc.nextInt();
        sc.close();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("leap year.");
        }
        else{
            System.out.println("not a leap year.");
        }
    }
}
