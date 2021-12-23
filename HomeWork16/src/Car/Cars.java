package Car;

public class Cars {
    public String brand;
    public String model;
    public Integer mileage;

    public Cars(String brand, String model, Integer mileage) {

        this.brand = brand;
        this.model = model;

        if (mileage>=0 && mileage<=999999){
            this.mileage= mileage;}
        else{
      System.out.println("Incorrect miles data");
    }

    }

}
