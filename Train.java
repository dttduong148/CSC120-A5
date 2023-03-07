import java.util.ArrayList;


public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;
    double fuelCapacity;
    int nCars;
    int passangerCapacity;

    /**
     * Constructor for class Train.
     * @param engine
     * @param nCars
     * @param passengerCapacity
     */
    public Train(Engine engine, int nCars, int passengerCapacity) { //CONSTRUCTOR
        this.engine = engine;
        this.fuelCapacity = this.engine.maxFuel;
        this.passangerCapacity = passengerCapacity;
        this.nCars = nCars;
        this.cars = new ArrayList<Car>();
    }

    /**
     * A getter method that returns the engine of the train.
     * @return this
     */
    public Engine getEngine() {
        return this.engine;

    }

    /**
     * A getter method that returns the i th car of the train.
     * @return this
     */
    public Car getCar(int i) {
        return this.cars.get(i);
    }

    /**
     * A getter method that returns the maximum capacity of the train.
     * @return this
     */
    public int getMaxCapacity() {
        return this.passangerCapacity;
    }

    /**
     * A getter method that returns the engine of the train.
     * @return this
     */
    public int getseatsRemaining() {
        int x = 0;
        for (int i = 0; i < this.nCars; i++) {
            Car CarNum = this.cars.get(i);
            x =+ CarNum.car.size();
        }
        int y = this.passangerCapacity - x;
        return y;
    }

    /**
     * A function that prints out the names of all passengers on board.
     * 
     */
    public void printManifest() {
        for (int i = 0; i < this.nCars; i++) {
            Car CarNum = this.cars.get(i);
            if (CarNum.car.isEmpty()) {
                System.out.println("Car number " + i + ":");
                System.out.println("THIS CAR IS EMPTY");
            }
            else {
                System.out.println("Car number " + i + ":");
                for (Passenger p : CarNum.car) {
                    System.out.print(p.getName());
                }
                System.out.println();
            }
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


        CarOne.addPassenger(Robbie);
        CarTwo.addPassenger(Jina);
        CarThree.addPassenger(Sarah);
        CarFour.addPassenger(Tana);
        CarFive.addPassenger(Abby);

        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);

        Train TrainA5 = new Train(myEngine, 5, 100);

        TrainA5.cars.add(CarOne);
        TrainA5.cars.add(CarTwo);
        TrainA5.cars.add(CarThree);
        TrainA5.cars.add(CarFour);
        TrainA5.cars.add(CarFive);

        System.out.println();
        System.out.println(TrainA5.getEngine());
    
        System.out.println();
        System.out.println(TrainA5.getCar(3));

        System.out.println();
        System.out.println(TrainA5.getMaxCapacity());

        System.out.println();
        System.out.println(TrainA5.getseatsRemaining());

        System.out.println();
        TrainA5.printManifest();

    }
}
