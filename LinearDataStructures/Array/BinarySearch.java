public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length -1;
        int step = 0;

        while (left<= right) {
            step++;
            int mid = left + (right-left)/2;

            if(target == arr[mid]){
                System.out.println("step: " + step);
                return mid;
            }else if(arr[mid] < target ){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,13,15};
        int target = 1;
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Binary Search Array index Result: [" + result + "]");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
