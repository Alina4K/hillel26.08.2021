package Cars;

public class SuperCar extends Car {
    public int speed;
    public static final String CUSTOM_COLOR  = "\u001B[36m";

    public SuperCar(String brand, String model, int milleage, int speed) {
        super(brand, model, milleage);
        this.speed = speed;

        CheckSpeed(speed);
    }

    public void CheckSpeed(int speed) {
        if(speed > 300) {
            System.out.println(CUSTOM_COLOR + "СТОП");
        }
    }
}
