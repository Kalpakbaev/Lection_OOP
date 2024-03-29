public abstract class Animal implements Sayable {
    public Animal(String name) {
        this.name = name;
    }

    private String name;

    //public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s; say %s;feed %s", name,say(),feed());
    }
}
