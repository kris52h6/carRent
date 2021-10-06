import java.lang.reflect.Array;
import java.util.ArrayList;

public class Garage {
    ArrayList<Car> cars = new ArrayList<>();
    PetrolCar pc = new PetrolCar("9012", "BMW", "8210",2003,4, 1, 20);

    ElectricCar ec = new ElectricCar("1234", "Tesla", "2200",2021,4, 200);

    DieselCar dc = new DieselCar("2750", "Skoda", "9910",2008,4, 5, true);

    public void addItems() {
        cars.add(pc);
        cars.add(ec);
        cars.add(dc);
    }

    public double calculateCarParkCharge() {
        double value = 0;
        for (Car car: cars) {
            value += car.calculateGreenOwnerCharge();
        }
        return value;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars;
    }
}

