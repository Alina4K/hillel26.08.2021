package cars;

public class Speed extends Cars {
    public Integer speed;

    public Speed(String brand, String model, Integer mileage, Integer speed) {
        super(brand, model, mileage);
        this.speed = speed;

        if (speed > 300) {

            System.out.println("Стоп");
        }
    }
}



