public class array123 {
    public boolean array123(int[] nums) {
        //for loop that iterates through the array
        for (int i = 0; i < (nums.length); i++) {
            //checks if the number of i is a 1 and then checks if the following number is 2 and if the third number is 3.
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        //returns false if the order 1, 2, 3 is not found in array
        return false;
    }
}
