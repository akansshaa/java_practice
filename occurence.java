import java.util.*;
public class occurence {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.print("enter element to search in array: ");
        System.out.println("no of occ of element "+num+"="+check(arr,num));
    }
    public static int check(int[] a,int n){
       int count = 0;
       boolean flag = false;
       for(int i=0;i<a.length;i++){
        if(a[i]==n){
            flag = true;
            count++;
        }
       }
        if(!flag){
            System.out.println("no such element found in the array.");
        }
       return count;
    }
}
