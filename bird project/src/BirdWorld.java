import java.util.ArrayList;

public class BirdWorld {

    public Car HondaCivic;
    public Car ChevySilverado;
    public Bird Bill;
    public Bird Birdy;
    public Bird[] ducks = new Bird[10];
    ArrayList<Bird> woodpeckers = new ArrayList<>();
    ArrayList<Bird> cardinals = new ArrayList<>();
    ArrayList<String> types = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World");
        BirdWorld myApp = new BirdWorld();
    }

    public BirdWorld() {

        HondaCivic = new Car("Civic",true, 4, "silver", "sedan");
        HondaCivic.printCarInfo();

        ChevySilverado = new Car("Silverado",true, 9, "red", "truck");
        ChevySilverado.printCarInfo();

        Bill = new Bird("Bill",false, 10, "blue", "penguin");
        Bill.printInfo();

        Birdy = new Bird("Birdy",true, 2, "yellow", "cockatoo");
        Birdy.printInfo();

        for(int i=0;i<ducks.length;i++) {
            ducks[i] = new Bird(i+5);
            ducks[i].printInfo();
        }

        System.out.println();

        for(int i=0;i<15;i++) {
            woodpeckers.add(new Bird(i+4));
            woodpeckers.get(i).printInfo();
        }

        System.out.println();

        for(int i=0;i<6;i++) {
            cardinals.add(new Bird(i+3));
            cardinals.get(i).printInfo();
        }
        HondaCivic = new Car("Civic",true, 4, "silver", "sedan");
        HondaCivic.printCarInfo();

        ChevySilverado = new Car("Silverado",true, 9, "red", "truck");
        ChevySilverado.printCarInfo();

        Bill = new Bird("Bill",false, 10, "blue", "penguin");
        Bill.printInfo();

        Birdy = new Bird("Birdy",true, 2, "yellow", "cockatoo");
        Birdy.printInfo();

        for(int i=0;i<ducks.length;i++) {
            ducks[i] = new Bird(i+5);
            ducks[i].printInfo();
        }

        System.out.println();

        for(int i=0;i<15;i++) {
            woodpeckers.add(new Bird(i+4));
            woodpeckers.get(i).printInfo();
        }

        System.out.println();

        for(int i=0;i<6;i++) {
            cardinals.add(new Bird(i+3));
            cardinals.get(i).printInfo();
        }

        System.out.println();

        types.add("penguin");
        types.add("duck");
        types.add("woodpecker");
        types.add("cardinal");

        System.out.println(types.get(2));
        System.out.println("types arraylist has size: " + types.size());

        System.out.println();

        types.add("penguin");
        types.add("duck");
        types.add("woodpecker");
        types.add("cardinal");

        System.out.println(types.get(2));
        System.out.println("types arraylist has size: " + types.size());

        for(int x=0;x<types.size();x++) {
            System.out.println(types.get(x));
        }

        System.out.println("remove woodpecker and print new types arraylist");
        types.remove(2);

        for(int x=0;x<types.size();x++) {
            System.out.println(types.get(x));
        }

    }

}
