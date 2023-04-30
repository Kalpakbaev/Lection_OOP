public class Duck extends Herbivores implements Walkable,Flyable{
    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "kria-krya";
    }

    @Override
    public int speedForFly() {
        return 80;
    }

    @Override
    public int speedForWalk() {
        return 5;
    }
}
