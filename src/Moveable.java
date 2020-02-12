package cs1302.inter;

public interface Moveable {
    // variables in interfaces are static and final by default
    boolean canMove = true;

    // methods in interfaces must be abstract (or default methods)
    // default methods give you the ability to add methods without
    // breaking the classes which implement Moveable
    // throw exceptions
    public boolean hasLegs();

}
