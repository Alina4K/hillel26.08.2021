package Cars;

public class Main2 {enum Brand{
    Audi,
    BMW,
    Ford,
    Porsche,
    Fiat,
}
    public class Car {
    private Brand brand;
    private String model;
    private int milleage = 0;
    public Car(Brand brand, String model, int milleage){
    this.brand = brand;
    this.model = model;
    if (milleage <=999999 && milleage >=0)
        this.milleage = milleage;
      else System.out.println("Milleage Validation");

    }

    public static void main(String[] args) {




    }

}
public class Car2 extends Car {

    private static final int maxSpeed = 300;
    private int speed = 0;

    public Car2(  Brand brand, String model, int milleage, int speed) {
        super(brand, model, milleage);
           if (speed <0)
               System.out.println("Speed Valid Error");
           else
               this.speed =speed;



    }
void checkSpeed (){
        if (speed >300){
            System.out.println("Speed is more than 300, STOP!!!");
        }
    }
}
}

