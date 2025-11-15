import java.util.*;
public class palindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = sc.next();
        System.out.println("the string is: "+ ((ispal(str) ? "palindrome"
                                                           :"not palindrome")));
        sc.close();
    }
    public static boolean ispal(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPosition = str.length() - 1;
        if(str.charAt(0)!=str.charAt(lastPosition)){
            return false;
        }
        String newStr = str.substring(1, lastPosition);
        return  ispal(newStr);
    }
}
