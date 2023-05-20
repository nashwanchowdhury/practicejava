//Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
public class altPairs {
    public String altPairs(String string) {

        //instantiates the string and makes it empty to begin
        String outcome = "";

        //for loop that iterates through the string in increments of 4 in order to hit the proper indexes.
        for (int i = 0; i < string.length(); i += 4) {
            //declares the endpoint for the indexes
            int last = i + 1;
            //adds the string segment at those indexes to the overall outcome string
            outcome = outcome + string.substring(i, end);
        }
        //returns the outcome string
        return outcome;
    }
}
