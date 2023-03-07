public class Passenger {
    
    public String name; //NAME OF PASSENGER

    /**
     * Constructor for class Passenger
     * @param name
     */
    public Passenger(String name) { //CONSTRUCTOR
        this.name = name;
    }

    /**
     * A function that adds a passenger into a car provided the passenger is not already on the car.
     * @param c
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * A getter method that returns the passenger's name.
     * @return this.name
     */
    public String getName() {
        return this.name;
    }
    /**
     * A fuction that removes a passenger from a car provided that the passenger is on the car.
     * @param c
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Passenger Robbie = new Passenger("Robbie");
        Passenger Jina = new Passenger("Jina");
        Passenger Sarah = new Passenger("Sarah");
        Passenger Tana = new Passenger("Tana");
        Passenger Abby = new Passenger("Abby");

        Car CarOne  = new Car(5);
        Car CarTwo = new Car(2);
        Car CarThree = new Car(1);
        Car CarFour = new Car(2);
        Car CarFive = new Car(5);

        Robbie.boardCar(CarOne);
        Jina.boardCar(CarTwo);
        Sarah.boardCar(CarThree);
        Tana.boardCar(CarFour);
        Abby.boardCar(CarFive);

        
    }
}
