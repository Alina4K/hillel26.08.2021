package Cars;

public class Car {
    public String brand;
    public String model;
    public int milleage;

    public Car (String brand, String model, int milleage) {
        if (milleage <= 999999 && milleage > 0) {
            this.brand = brand;
            this.model = model;
            this.milleage = milleage;
        } else {
            System.err.println("Пробег не валидный: " + milleage);
        }
    }
}
