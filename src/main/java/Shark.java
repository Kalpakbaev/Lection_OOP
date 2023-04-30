public class Shark extends Predator implements SwimingSpeed{
    public Shark(String name) {
        super(name);
    }

    @Override
    public String feed() {
        return "fish";
    }

    @Override
    public String say() {
        return "aaa-aaa-aa";
    }

    @Override
    public int swimSpeed() {
        return 150;
    }
}
