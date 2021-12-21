package Cars;

public class Cars {
    public String Brand;
    public String Model;
    public Integer Mileage;

    public Cars (String Brand, String Model, Integer Mileage) {
        this.Brand = Brand;
        this.Model = Model;
        this.Mileage = Mileage;
        if ( Mileage >= 0  ||  Mileage <= 999999);
        System.out.println ("Вы ввели не валидный пробег");
}}
