package cars;

public class Car {

    private String Brand;
    private String Model;
    private Integer Mileage;

    public Car(String brand, String model, Integer mileage) {
        this.Brand = brand;
        this.Model = model;
        this.Mileage = mileage;

        if (mileage >= 0 && mileage <= 999999) {
            this.Mileage = mileage;
            System.out.println("Валидация на Milage прошла успешно");
        } else {
            System.out.println("Mileage has to be from 0 to 999999");
        }

    }


}

