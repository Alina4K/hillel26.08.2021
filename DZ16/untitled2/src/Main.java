import Cars.SuperCar;
import Users.User;
import Cars.Car;

public class Main {

    public static void main(String[] args) {
        User UserByEmail = new User("test@test.com", "7894");
        User UserAllFields = new User("second@test.com", "world", "", "Che");

        Car BMW = new Car("BMW", "E32", 1545000);
        SuperCar AUDI = new SuperCar("AUDI", "TT", 546540, 322);
    }

}

