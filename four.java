package assignment_1;

public class four {

    public static int[] increment(int nums[]){
        int n = nums.length;
        for(int i=n-1; i>=0; i--){
            if(nums[i] != 9){
                nums[i]++;
                return nums;
            }
            else{
                nums[i] = 0;
            }
        }
        // if all elements are 9 then create a new array of +1 length of nums
        // adding 1 in 99 gives 100
        int result[] = new int[n+1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(increment(nums));
        
    }
}
