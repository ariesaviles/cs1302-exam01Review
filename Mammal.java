
public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    } // constructor


    // abstract classes are like normal concrete classes
    // except they can have abstract methods
    public abstract void sound();

    public abstract boolean isFarmMammal();

    // all Mammals have legs
    public boolean hasLegs() {
        return true;
    } // hasLegs


} // Mammal
