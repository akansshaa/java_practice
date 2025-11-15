public class mergeTwo {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        System.out.println("the new megred array: ");
        ArrayUtility.displayArray(mergedArr);
    }
    public static int[] merge(int[] a1,int[] a2){
        int size = a1.length + a2.length;
        int[] newArr = new int[size];
        int i=0,j=0,k=0;
        while(i<a1.length || j<a2.length){
            if(j==a2.length || (i<a1.length && a1[i]<a2[j])){
                newArr[k] = a1[i];
                i++;
                k++;
            }else{
                newArr[k] = a2[j];
                j++;
                k++;
            }
        }
        return newArr;
        }
}
