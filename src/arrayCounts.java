public class arrayCounts {
    public int arrayCount9(int[] nums) {
        //instantiates int to count the number of 9's in the array
        int count = 0;
        //for loop that iterates through the length of the array
        for (int i = 0; i < nums.length; i++) {
            //if statement to check if the number at each index is equal to 9
            if (nums[i] == 9) {
                //adds to the overall count of how many 9's are in the array
                count++;
            }
        }
        //return the overall count
        return count;
    }
}
