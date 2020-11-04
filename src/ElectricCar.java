public class ElectricCar extends Car{
    // Instance variables
    protected double batterySize;
    protected String batteryType;

    // Default constructor, calls parent default constructor
    public ElectricCar() {
        super();
        setBatterySize(0);
        setBatteryType("");
    }

    /** Overloaded constructor
     * @param   make        brand of the vehicle (e.g. Ford)
     * @param   model       name of the product (e.g. F-150)
     * @param   color       color of the vehicle (e.g. brown)
     * @param   year        year the product was made (e.g. 2020)
     * @param   weight      weight of the vehicle (e.g. 2500 (lbs))
     * @param   pumpCost    cost of using pump to fill up tank  (e.g. ($)1.50
     * @param   batterySize size of battery used in the vehicle (e.g. 100 (kWh))
     * @param   batteryType type of battery used in the vehicle (e.g. lithium-ion)
     */
    public ElectricCar(String make, String model, String color, int year, int weight, double pumpCost,
                       double batterySize, String batteryType) {
        super(make, model, color, year, weight, pumpCost);
        setBatterySize(batterySize);
        setBatteryType(batteryType);
    }

    // Getters and Setters
    public double getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(double batterySize) {
        if (batterySize > 0) {
            this.batterySize = batterySize;
        }
        else {
            this.batterySize = 4.0;
        }
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        if (!batteryType.isBlank()) {
            this.batteryType = batteryType;
        }
        else {
            this.batteryType = "Lithium-ion";
        }
    }

    /**
     * @return object with information in text form, printed to the console
     */
    @Override
    public String toString() {
        String pCost = String.format("%.2f", CalcCostPerFill(getPumpCost()));
        return "------------------------------------\n" +
                super.toString() + "\nBattery Size: \t\t" + getBatterySize() + "\nBattery Type: \t\t" + getBatteryType() +
                "\nCost to fill tank: \t" + pCost +
                "\n-----------------------------------";
    }

    /**
     * @param pumpCost cost of using pump to fill up tank
     * @return cost to fill up tank
     */
    @Override
    public double CalcCostPerFill(double pumpCost) {
        return batterySize * pumpCost;
    }
}
