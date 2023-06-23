package assignment_1;

import java.util.Arrays;

public class seven {

    public static int[] order(int nums[]){
        int index =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        for(int j=index; j<nums.length; j++){
            nums[j] =0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] ={0,1,0,3,1,2};
        order(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
