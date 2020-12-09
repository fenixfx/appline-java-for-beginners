public class ThirdTaskClass {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 7, 9};
        int tmp = nums[0];
        nums[0] =  nums[nums.length-1];
        nums[nums.length-1] = tmp;
        System.out.println(nums[0] + nums[(nums.length-1)/2]);
    }
}
