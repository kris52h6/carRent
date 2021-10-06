public class ElectricCar extends Car {
    private int batteryCapacityKWh;
    private int maxKm;
    private int whPerKm;
    private double kmPerLiter;

    public ElectricCar(String regNumber, String brand, String model, int year, int amountOfDoors, int whPerKm) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPerKm = whPerKm;
        this.kmPerLiter = convertWhPerKmToKmPerLiter(whPerKm);
    }

    private double convertWhPerKmToKmPerLiter(int whPerKm) {
        double whPer100Km = (whPerKm/91.25);
        double kmPerLiter = (100/whPer100Km);
        return kmPerLiter;
    }

    public double getKmPerLiter() {
        return kmPerLiter;
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
        return super.toString() +  "ElectricCar{" +
                "batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPerKm=" + whPerKm +
                ", kmPerLiter=" + kmPerLiter +
                '}';
    }
}
