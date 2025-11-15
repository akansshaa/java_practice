public class maxArray {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Finding maximum element in the array-");
        int max = Integer.MIN_VALUE;
        for(int nums:arr){
            if(nums>max){
                max = nums;
            }
        }
        System.out.print("maximum number is: "+max);
    }
}
