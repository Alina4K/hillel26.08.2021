import NewUser.User;
import utils.Utils;


public class Main {
    public static void main(String[] args) {
        User user = new User("seb@llis.com", "6xgon", "Sebastian", "Mihaellis");
        System.out.println(user.name);
        System.out.println(user.last_name);

        System.out.println(Utils.containsDog("Hughes@.dewq"));

    }


}
