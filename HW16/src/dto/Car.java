package dto;

public class Car {
    private static final int MAX_MILEAGE = 999999;

    private String brand;
    private String model;
    private int mileage;

    public Car(String brand, String model, int mileage) {
        validateMileage(mileage);
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        validateMileage(mileage);
        this.mileage = mileage;
    }

    private static void validateMileage(int mileage) {
        if(mileage > MAX_MILEAGE) {
            throw new IllegalArgumentException("Mileage should be less then " + MAX_MILEAGE + " miles!");
        } else if (mileage < 0) {
            throw new IllegalArgumentException("Mileage can't be negative value.");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
