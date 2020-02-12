public class Cow extends Mammal {


    public Cow(String name) {
        super(name);
    } // constructor

    public boolean isFarmMammal() {
        return true;
    } // isFarmMammal

    public void sound() {
        System.out.println("Moo!");
    } // sound
} // Cow
