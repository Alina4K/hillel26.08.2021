//import java.util.Scanner;
import cars.Car;
import cars.Car2;
import users.User1;
import users.User2;

  public class Main {

      public static void main(String[] args) {

          System.out.println("User 1: Все поля обязательны");
          System.out.println("User 2: Только email и пароль обязательны");

          User1 user1 = new User1("Yuri", "Linsky", "Linsky@gmail.com", "qwerty123", "qwerty123");
          User2 user2 = new User2("Linsky@gmail.com", "qwerty123", "qwerty123");
            user1.Validation();
            user2.Validation();

          Car car = new Car("Porsche", "Panamera", 696969);
          Car2 speed = new Car2 ("Porsche", "Panamera", 696969, 301);

      }
  }


