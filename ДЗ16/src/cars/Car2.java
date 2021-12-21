package cars;


public class Car2 extends Car {
   public Integer speed;

   public Car2 (String brand, String model, Integer mileage, Integer speed) {
       super(brand, model, mileage);
        this.speed = speed;
        if (speed > 300) {
            System.out.println("СТОП");
        }
    }
}
