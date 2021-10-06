public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();


        garage.addItems();
        System.out.println(garage);

        double carParkCharge = garage.calculateCarParkCharge();
        System.out.printf("Total charge is: %.2fkr", carParkCharge);
    }


}
