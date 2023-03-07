public class Engine {

    private FuelType currentFuelType;
    double maxFuel = 100.0;
    double currentFuel;
     
    /** 
     * Constructor of class Engine.
     * @param fuel
     * @param n
     */

    public Engine(FuelType fuel, double n) { //CONSTRUCTOR
        this.currentFuelType = fuel;
        this.currentFuel = n;
    }

    /**
     * A function that refill the current fuel level of the Engine to the maximum.
     */
    public void refuel() {
        this.currentFuel = this.maxFuel;
    }

    /**
     * A function that prompts the Engine to go and decrease fuel level provided that the current fuel level is above 0.
     */
    public void go() {
        if (this.currentFuel > 0) {
            System.out.println("Remaining fuel level: " + currentFuel + ".");
            this.currentFuel -= 10;
        }
        else {
            throw new RuntimeException("Out of fuel.");
        }
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
};
