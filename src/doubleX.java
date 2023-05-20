public class doubleX {
    boolean doubleX(String string) {
        //finds the index of the first x in any string
        int i = string.indexOf("x");
        //if statement that checks to see if the next letter after the first x is also an x
        if (string.charAt(i + 1) == 'x') {
            return true;
        }
        //returns false if they cant find two x's next to each other
        return false;
    }
}