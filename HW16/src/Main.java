import dto.ExtendedCar;
import dto.User;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(new User("qwe@qwe.qwe", "pw"));
            System.out.println(new User("qwe@qwe.qwe", "pw", "User", "Userovich"));
            System.out.println(new User("qwe.qwe", "pw"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======================================");

        try {
            System.out.println(new ExtendedCar("Audi", "TT", 1, 20));
            System.out.println(new ExtendedCar("Audi", "TT", 999999, 300));
            System.out.println(new ExtendedCar("Audi", "TT", 1000000, 500));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======================================");

        try {
            ExtendedCar car = new ExtendedCar("Audi", "TT", 1, 20);
            car.setMaxSpeed(301);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
