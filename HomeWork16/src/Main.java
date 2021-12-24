import Car.Cars;
import Car.Mini;
import User.Users;

public class Main {
    public static void main(String[] args){
        Users user = new Users("Tom","Ford", "test@gmail.com", "Qwerty123");
        System.out.println(user.name);
        Cars car=new Cars("Audi","Q7",111);
        System.out.println(car.brand);
       Mini car1 =new Mini("Ford","Fusion",115,301);
       System.out.println(car.speed);
    }
        }

