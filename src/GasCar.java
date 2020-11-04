public class GasCar extends Car{
    // Instance variables
    protected double tankSize;
    protected String fuelType;

    // Default constructor using default parent constructor
    public GasCar() {
        super();
        setTankSize(0);
        setFuelType("");
    }

    /** Overloaded constructor
    * @param    make        brand of the vehicle (e.g. Ford)
    * @param    model       name of the product (e.g. F-150)
    * @param    color       color of the vehicle (e.g. brown)
    * @param    year        year the product was made
    * @param    weight      weight of the vehicle
    * @param    pumpCost    cost of using pump to fill up tank
    * @param    tankSize    size of the gas tank of the vehicle
    * @param    fuelType    type of fuel to be put in the gas tank
     */
    public GasCar(String make, String model, String color, int year, int weight, double pumpCost,
                  double tankSize, String fuelType) {
        super(make, model, color, year, weight, pumpCost);
        setTankSize(tankSize);
        setFuelType(fuelType);
    }

    // Getters and Setters
    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize) {
        if (tankSize > 0) {
            this.tankSize = tankSize;
        }
        else {
            this.tankSize = 4.0;
        }
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        if (!fuelType.isBlank()) {
            this.fuelType = fuelType;
        }
        else {
            this.fuelType = "Unleaded";
        }
    }

    /**
     * @return object with information in text form, printed to the console
     */
    @Override
    public String toString() {
        // Formats the fill cost to .2 decimal places, puts it in a string to format it
        String pCost = String.format("%.2f", CalcCostPerFill(getPumpCost()));
        return  "------------------------------------\n" +
                super.toString() + "\nTank Size: \t\t\t" + getTankSize() + "\nFuel Type: \t\t\t" + getFuelType() +
                "\nCost to fill tank: \t" + pCost +
                "\n-----------------------------------";
    }

    /**
     * @param pumpCost cost of using pump to fill up tank
     * @return cost to fill up tank
     */
    @Override
    public double CalcCostPerFill(double pumpCost) {
        return tankSize * pumpCost;
    }
}
