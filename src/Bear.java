public class Bear extends Mammal {

    public Bear(String name) {
        super(name);
    } // constructor

    public boolean isFarmMammal() {
        return false;
    } // isFarmMammal

    public void sound() {
        System.out.println("Roar!");
    } // sound()

} // Bear
