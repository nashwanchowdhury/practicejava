public class stringYak {
    public String stringYak(String string) {
        //instantiates the string and makes it empty to start.
        String outcome = "";
        //for loop that loops through the string
        for (int i=0; i<string.length(); i++) {
            // Looks for the letters y, a, and k in order throughout the string where the a can be any character.
            if (i+2<string.length() && string.charAt(i)=='y' && string.charAt(i+2)=='k') {
                //skips all three letters if it finds yak within the string
                i =  i + 2;
            } else { // if yak is not found, it just returns the original string
                outcome = outcome + string.charAt(i);
            }
        }
        return outcome;
    }
}
