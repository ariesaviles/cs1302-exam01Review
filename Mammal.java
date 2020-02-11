
public abstract class Mammal {

    // abstract classes are like normal concrete classes
    // except they can have abstract methods
    public abstract boolean isFarmAnimal();

    public abstract String getSound();

    // all Mammal's can regular body heat, notice this is a concrete method
    public boolean canRegulateBodyHeat() {
        return true;
    }

} // Mammal
