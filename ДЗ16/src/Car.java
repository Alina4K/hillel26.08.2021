public class Car {
    public String brand;
    public String model;
    public double mileage;

    public void addCar(Car car1) {
        if (mileage>= 0 && mileage<=999999) {
            System.out.println("Milaege is valid");}
        else {
            System.out.println("Mileage is invalid");}
    }

}
