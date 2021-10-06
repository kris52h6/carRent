public class PetrolCar extends Car {
    private int octane;
    private int kmPerLiter;

    public PetrolCar(String regNumber, String brand, String model, int year, int amountOfDoors, int octane, int kmPerLiter) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.octane = octane;
        this.kmPerLiter = kmPerLiter;
    }

    @Override
    public double calculateGreenOwnerCharge() {
        double result = 0;
        if (kmPerLiter >= 5) {
            result = 5500;
            if (kmPerLiter >= 10) {
                result = 2340;
                if (kmPerLiter >= 15) {
                    result = 1050;
                    if (kmPerLiter >= 20) {
                        result = 330;
                    }
                }
            }
        } else {
            result = 10470;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +  "PetrolCar{" +
                "octane=" + octane +
                ", kmPerLiter=" + kmPerLiter +
                '}';
    }
}
