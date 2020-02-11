public class Cow extends Mammal {
    String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public String getSound() {
        return "moo";
    }


}
