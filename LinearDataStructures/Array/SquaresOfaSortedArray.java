import java.util.Arrays;

public class SquaresOfaSortedArray {

    public static int[] sortSquares(int[] nums){
        int[] result = new int[nums.length];
        int index = result.length - 1;

        for(int i = 0, j = nums.length -1; i <= j ;){

            if(nums[i] * nums[i] > nums[j] * nums[j]){
                result[index--] = nums[i] * nums[i];
                i++;
            }else{
                result[index--] = nums[j] * nums[j];
                j--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        
        int[] nums = {-4,-1,0,3,10};

        int[] arr = sortSquares(nums);
        System.out.println("Sorted squares: " +Arrays.toString(arr));
    }
}