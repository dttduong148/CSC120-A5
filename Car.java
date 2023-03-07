import java.util.ArrayList;

public class Car {
    ArrayList<Passenger> car;
    int maxCapacity;

    /**
     * A constructor for class Car.
     * @param n
     */
    public Car(int n) {  // CONSTRUCTOR
        this.maxCapacity = n;
        this.car = new ArrayList<Passenger>();

    }

    /** A getter method to get the maximum capacity of the car.
     * 
     * @return this.maxCapacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }

    /**
     * A function that returns the number of remaining seats.
     * @return int x
     */
    public int seatsRemaining() {
        int x = this.maxCapacity - this.car.size();
        return x;
    }

    /**
     * A function that adds a passenger into a car provided the passenger is not already on the car.
     * @param p
     */
    public void addPassenger(Passenger p) {
        if (this.car.contains(p)) {
            throw new RuntimeException("Passenger " + p.name + " is already on board.");
        }
        if (this.seatsRemaining() > 0) {
            this.car.add(p);
            System.out.println("Passenger " + p.name + " is successfully added to this car.");
        }
        else {
            System.out.println("No vacant seat.");
        }

    }

    /**
     * A fuction that removes a passenger from a car provided that the passenger is on the car.
     * @param p
     */
    public void removePassenger(Passenger p) {
        if (!this.car.contains(p)) {
            throw new RuntimeException("Passenger " + p.name + " is not on board.");
        }
        this.car.remove(p);
        System.out.println("Passenger " + p.name + " successfully removed.");

    }


    /**
     * A function that prints out a list of all passengers on board or "THIS CAR IS EMPTY." if there is no passenger on board.
     */
    public void printManifest() {
        if (this.car.isEmpty()) {
            System.out.println("THIS CAR IS EMPTY.");
        }
        else {
            System.out.print("Passengers on board: " );
            for (Passenger p : this.car) {
                System.out.print(p.getName());
            }
            System.out.println();
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

        System.out.println(CarOne.seatsRemaining());   

        System.out.println(CarTwo.getCapacity());


        CarThree.printManifest();
    
        CarFive.printManifest();

        try { //ERROR MESSAGE
            int x = 0;
            while (x == 0) {
                Robbie.getOffCar(CarFive);
                x = 1;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); 
        }

        try { //ERROR MESSAGE
            int x = 0;
            while (x == 0) {
                Robbie.boardCar(CarOne);
                x = 1;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); 
        }


    }

}