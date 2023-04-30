public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pip-Pip_pip";

    }
    public int speedForFly(){
        return 120;
    }

}
