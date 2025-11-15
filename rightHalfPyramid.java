public class rightHalfPyramid {
    public static void main(String[] args) {
        int n = 5; // height of pyramid
        
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
