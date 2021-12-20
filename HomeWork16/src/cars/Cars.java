package cars;

public class Cars {
    public String brand;
    public String model;
    public Integer mileage;


    public Cars(String brand, String model, Integer mileage) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;

        if ( mileage >= 0  &&  mileage <= 999999) {
        }
        else {
            System.out.print("Неправильный Milage, допустимые значения от 0 до 999999 ");}
    }
    }


