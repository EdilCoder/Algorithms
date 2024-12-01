import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int slow = 0;
        for(int fast = 0; fast <= nums.length - 1; fast++){
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;//slow will cover the removed element, but still in end of array
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,1,1,6};
        int val = 1;
        
        int[] expectedNUms = {3,5,6};
        int k = removeElement(nums, val);

        assert k == expectedNUms.length;
        System.out.println("After remove element there have "+k+" elements in array.");
        
        System.out.println("Slow was covered the removed element: ");
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        Arrays.sort(nums, 0, k);
        System.out.println("After sorted element: ");
        for(int i = 0; i < k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}