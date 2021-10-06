public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPerLiter;

    public DieselCar(String regNumber, String brand, String model, int year, int amountOfDoors, int kmPerLiter, boolean hasParticleFilter) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.kmPerLiter = kmPerLiter;
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public double calculateGreenOwnerCharge() {
        double result = 0;
        if (kmPerLiter >= 5) {
            result = (5500 + 2270);
            if (kmPerLiter >= 10) {
                result = (2340 + 1850);
                if (kmPerLiter >= 15) {
                    result = (1050 + 1390);
                    if (kmPerLiter >= 20) {
                        result = (330 + 130);
                    }
                }
            }
        } else {
            result = (10470 + 15260);
        }

        if (hasParticleFilter) {
            result += 1000;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "DieselCar{" +
                "hasParticleFilter=" + hasParticleFilter +
                ", kmPerLiter=" + kmPerLiter + "Green owner charge: " +
                '}';
    }
}
