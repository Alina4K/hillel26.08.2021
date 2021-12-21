public class Car {
    public String brand;
    public String model;
    public int milleage;

    public Car (String brand, String model, int milleage) {
        this.brand = brand;
        this.model = model;
        this.milleage = milleage;
    }

    public void Info() {
        System.out.println("");
        System.out.println("Данные машины: =================");
        System.out.println("Бренд: "+this.brand);
        System.out.println("Модель: "+this.model);
        System.out.println("Пробег: "+this.milleage);
        System.out.println("=================================");
    }

    public void Stop() {
        System.out.println("");
        System.out.println("=================================");
        System.out.println("СТОП");
        System.out.println("Машина " + this.brand + " " + this.model + " остановилась!");
        System.out.println("=================================");
    }

}
