public class arrayFront9 {
    public boolean arrayFront9(int[] nums) {
        //instantiates int as length of array
        int last = nums.length;
        //makes the length of array 4 if it is not
        if (last > 4) {
            last = 4;
        }
        //loops through the array up to 4 times depending on length of array
        for (int i = 0; i < last; i++) {
            //checks to see if array item is a 9 or not
            if (nums[i] == 9) {
                //returns true if it finds a 9 in the array
                return true;
            }
        }

        return false;
    }
}
