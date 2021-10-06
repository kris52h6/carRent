public abstract class Car {
    private String regNumber;
    private String brand;
    private String model;
    private int year;
    private int amountOfDoors;

    public Car(String regNumber, String brand, String model, int year, int amountOfDoors) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }
    public abstract double calculateGreenOwnerCharge();


    @Override
    public String toString() {
        return "\n\t" + "Car{" +
                "regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountOfDoors=" + amountOfDoors +
                '}';
    }
}
