public class MinSubArrayLen {
    
    public static int minSubArrayLen(int target, int[] nums){
        int result = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            //Sliding Window
            while(sum >= target){
                result = Math.min(result, right - left + 1);
                System.out.println("result:"+result);
                sum -= nums[left++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int result = minSubArrayLen(target, nums);

        System.out.println(result);
    }
}
