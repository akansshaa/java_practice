public class min_maxarr{
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int min = MIN(arr);
        int max = MAX(arr);
        System.out.println("minimum: "+ min);
        System.out.println("maximum: "+max);
    }
    public static int MIN(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;

    }
    public static int MAX(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }   
}
