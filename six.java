package assignment_1;

import java.util.Arrays;

public class six {

    public static boolean find(int nums[]){
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        int nums[] = {1,2,3,1,1,1};
        System.out.println(find(nums));
    }
}
