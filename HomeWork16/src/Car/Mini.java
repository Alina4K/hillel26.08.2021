package Car;

 public class Mini extends Cars{
     public Integer speed;

    public Mini(String brand, String model, Integer mileage, Integer speed) {
        super(brand, model, mileage);

        this.speed=speed;

        if (speed > 300) {
            System.out.println("STOP!");
        }
    }
 }