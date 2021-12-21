public class Main {
    public static void main(String[] args){

        User user1 = new User("Alya","Melnyk","blablabla@gmail.com", "qwerty");

        user1.addUser(user1);

        User user2 = new User("blablablagmail.com", "qwerty");

        user1.addUser(user2);

        /*String checkSobaka = user1.email;  //это недоработання попытка проверки собаки
        char[] result = checkSobaka.toCharArray();
        for (int i=0; i < result.length;i++)
            if (result [i] == '@'){
                System.out.println("Email is inalid");}
            else {System.out.println("Email is valid");}*/

        Car car1 = new Car();
        car1.brand = "Audi";
        car1.model = "TT";
        car1.mileage = 9999999;
        //System.out.println(car1.mileage);

        car1.addCar(car1);

        CarSpeed car2 = new CarSpeed();
        car2.speed = 400;
        System.out.println(car2.speed);

        car2.Stop(car2);







    }
}
