//Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

public class frontTimes {
    public String frontTimes(String string, int a) {
        //instantiates int to find the first 3 letters of the string
        int charlimit = 3;
        //checks to see if there are less than 3 letters in the string. If there is then it will only display a max of the length of the string.
        if (charlimit > string.length()) {
            charlimit = string.length();
        }
        //declares string copy to the first three letters of the inputted String
        String copy = string.substring(0, charlimit);
        //instantiates string and makes it empty at first
        String outcome = "";
        //for loop that iterates the amount of times a
        for (int i = 0; i < a; i++) {
            //adds another iteration of copy to the outcome string until the loop stops
            outcome = outcome + copy;
        }
        //returns the outcome
        return outcome;
    }
}
