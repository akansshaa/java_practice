import java.util.*;
public class diagonalSum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("enter elements: ");
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int result = sum(arr);
        System.out.println("sum of diagonals:" + result);
    }
    public static int sum(int[][] a){
       int sum = 0;
       int sumLeft = leftDiagonal(a);
       int sumRight = rightDiagonal(a);
       sum = sumLeft+sumRight;
       if(a.length%2!=0){
          int centre = a.length/2;
          sum -= a[centre][centre];
       }
       return sum;
    }
    public static int leftDiagonal(int[][] a){
        int sum = 0;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if(i==j){
                sum+= a[i][j];
               }
            }
        }
        return sum;
    }
    public static int rightDiagonal(int[][] a){
         int sum = 0;
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if((i+j)==a.length-1){
                sum+= a[i][j];
               }
            }
        }
        return sum;
    }
}
/*for(int i=0; i<a.length; i++){
    sumLeft += a[i][i];                // main diagonal
    sumRight += a[i][a.length - 1 - i]; // secondary diagonal
}
 */
