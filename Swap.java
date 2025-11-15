import java.util.Scanner;
public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first num: ");
        int num1 = sc.nextInt();
        System.out.print("enter second num: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1+num2;
        num1 = sum - num1;
        num2 = sum - num2;
        System.out.println("----Swapped Numbers----");
        System.out.println("first num: " + num1);
        System.out.println("second num: " + num2);
    }
}
