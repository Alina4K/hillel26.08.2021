package dto;

public class ExtendedCar extends Car {
    private static final int MAX_SPEED = 300;

    private int maxSpeed;

    public ExtendedCar(String brand, String model, int mileage, int maxSpeed) {
        super(brand, model, mileage);
        validateMaxSpeed(maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed > MAX_SPEED)
            System.out.println("STOP!");
        validateMaxSpeed(maxSpeed);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private static void validateMaxSpeed(int maxSpeed) {
        if(maxSpeed > MAX_SPEED) {
            throw new IllegalArgumentException("Max speed should be less then " + MAX_SPEED + " mph.");
        } else if (maxSpeed < 0) {
            throw new IllegalArgumentException("Max speed can't be negative.");
        }
    }

    @Override
    public String toString() {
        return "ExtendedCar{" +
                "brand='" + super.getBrand() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", mileage=" + super.getMileage() +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
