public class reverseArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] newArr = reverse(arr);
        ArrayUtility.displayArray(newArr);
    }
    public static int[] reverse(int[] a){
        int[] newArr = new int[a.length];
        int j=0;
        for(int i=a.length-1 ;i>=0;i--){
            newArr[j] = a[i];
            j++;
        }
        return newArr;
    }
}
