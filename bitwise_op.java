import java.util.*;
public class bitwise_op {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("showing bitwise operations:");
        System.out.print("enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int result_and = num1 & num2;
        int result_or = num1 | num2;
        int result_xor = num1^num2;
        int comp = ~num1;
        System.out.println("result: "+result_and);
        System.out.println("or result: "+ result_or);
        System.out.println("xor result: "+ result_xor);
        System.out.println("complement of first number: "+comp);
    }
}
