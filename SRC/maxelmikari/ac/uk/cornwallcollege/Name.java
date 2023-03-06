package maxelmikari.ac.uk.cornwallcollege;

public class Name {
    String first;
    String last;

    /**constructor*/
    public Name(String s) {
        int pos = s.indexOf(' ');
        first = s.substring(0,pos);
        last = s.substring(pos+1);
    }

    public String reverseOrder() {
        return last + ", " + first;
    }

    @Override
    public String toString() {
        return first + " " + last;
    }

}
