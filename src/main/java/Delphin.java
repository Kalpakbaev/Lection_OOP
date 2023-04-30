public class Delphin extends Predator implements SwimingSpeed{
    public Delphin(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "QQQ-QQQ";
    }

    @Override
    public int swimSpeed() {
        return 120;
    }
}
