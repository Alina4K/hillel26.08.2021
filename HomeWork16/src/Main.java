import cars.Cars;
import cars.Speed;
import user.User;
import user.User2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создать юзера? Все поля обязательны - 1, Только email и пароль обязательны - 2");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 1) {
            User user1 = new User("Vas", "Sya", "gob@gmail.com", "dghdh");
        }
        else {
            User2 user2 = new User2("Vas@gmail.com", "Sya");
                    }
    }

  /*public static void main (String[] args){
                   Cars car = new Cars("Audi", "TT", 12312);
   }*/




   /* public static void main (String[] args){
        Speed speed  = new Speed("Tesla", "X", 14785, 300);
         }*/
}









