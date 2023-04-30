public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList((new Wolf("Wolf"))).addList(new Hare("Hare"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("BatMan"));
        for (var item : zoo.getListAnimal()) {
            System.out.println(item);

        }
        System.out.println("_________________");
        for (var item : zoo.getSayable()) {
            System.out.println(item.say());
        }
        System.out.println("______________");
        for (var item : zoo.walkables()) {
            System.out.printf("%s , %d\n", item.toString(), item.speedForWalk());
        }
        System.out.println("---------------");
        for (var item : zoo.flyables()) {
            System.out.printf("%s - %d", item.toString(), item.speedForFly());
        }
        System.out.println("----------");
        System.out.println("Winner " + zoo.winnerWolk());
        System.out.println("----------------------");
        System.out.println("Winner " + zoo.winnerFly());

    }

}
