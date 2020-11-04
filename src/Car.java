/**
 * Car class is to be used as parent/base class for other car classes (GasCar and ElectricCar).
 * Those classes will extend or inherit from the Car class.
 * Therefore the parent class is abstract so it can't be instantiated and only inherited.
 * Uses instance variables for basic info of objects, then there are specific values inside specific classes.
 * There are also constructors, both default and overloaded, as well as an overridden toString method.
 * Abstract method CalcCostPerFill that all classes must implement.
 * @author Aaron Lang
 * @version 1.0
 * @since 2020-10-22
 */
public abstract class Car {
    // Instance variables
    protected String make, model, color;
    protected int year, weight;
    protected double pumpCost;

    // Default constructor, sets up variables for object with default values
    public Car() {
        setMake("");
        setModel("");
        setColor("");
        setYear(0);
        setWeight(0);
        setPumpCost(0);
    }

    /** Overloaded constructor to accept unique values
     * @param   make      brand of the vehicle (e.g. Ford)
     * @param   model     name of the product (e.g. F-150)
     * @param   color     color of the vehicle (e.g. brown)
     * @param   year      year the product was made
     * @param   weight    weight of the vehicle
     * @param   pumpCost  cost of using pump to fill up tank
     */
    public Car(String make, String model, String color, int year, int weight, double pumpCost) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setWeight(weight);
        setPumpCost(pumpCost);
    }

    // Getters and Setters
    public String getMake() {
        return make;
    }

    // Using isBlank() method instead of .equals("") as isBlank will check for whitespace characters too!
    public void setMake(String make) {
        if (!make.isBlank()) {
            this.make = make;
        }
        else {
            this.make = "Factory Default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (!model.isBlank()) {
            this.model = model;
        }
        else {
            this.model = "Factory Default";
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isBlank()) {
            this.color = color;
        }
        else {
            this.color = "Factory Default";
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        }
        else {
            this.year = 1;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
        else {
            this.weight = 2000;
        }
    }

    public double getPumpCost() {
        return pumpCost;
    }

    public void setPumpCost(double pumpCost) {
        if (pumpCost > 0) {
            this.pumpCost = pumpCost;
        }
        else {
            this.pumpCost = 2.00;
        }
    }

    /**
     * @return object with information in text form, printed to the console
     */
    @Override
    public String toString() {
        return "Make:\t\t\t\t" + getMake() + "\nModel:\t\t\t\t" + getModel() + "\nColor:\t\t\t\t" + getColor() +
                  "\nYear:\t\t\t\t" + getYear() + "\nWeight:\t\t\t\t" + getWeight();
    }

    // Abstract method that all classes must implement
    public abstract double CalcCostPerFill(double pumpCost);
}
