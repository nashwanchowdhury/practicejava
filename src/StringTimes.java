//Given a string and a non-negative int n, return a larger string that is n copies of the original string.

public class StringTimes {
    public String stringTimes(String string, int a) {
        //Instantiates the string copy and makes it empty initially
        String copy = "";
        //for loop that iterates the number of time based on int a
        for (int i = 0; i < a; i++) {
            //adds the string over and over again to the previous string
            copy = copy + string;
        }
        //returns the copy with all the string copied a times
        return copy;
    }
}