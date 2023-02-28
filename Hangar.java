public class Hangar {

    public static void main(String[] args) {

        // clio receives a reference to a new instance of class Car
        Car clio = new Car("Clio"); 
        System.out.println("Je suis " + clio.getBrand() + " et je fais " + clio.doStuff());
        // titanic receives a reference to a new instance of class Boat
        Boat titanic = new Boat("Titanic");
        System.out.println("Je suis " + titanic.getBrand() + " et je fais " + titanic.doStuff());
    }
}