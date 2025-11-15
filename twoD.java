import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of rows: ");
        int r = sc.nextInt();
        System.out.print("enter size of column: ");
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("enter elements in rows and columns:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("elements in the array are as follows: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
