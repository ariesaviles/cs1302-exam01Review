
public class Turtle implements Animal {
    String name;
    boolean isFemale;

    // constructor for Turtle object
    public Turtle(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFenale;
    } // constructor

    public boolean ableToLayEggs() {
        if (isFemale == true) {
            return true;
        } else {
            return false;
        } // if
    } // ableToLayEggs()

}
