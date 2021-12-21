public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;

    /* 2. создание пользователя двумя способами*/
    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    String sub = "@";
    public User(String email, String password) {
        this.email= email;
        this.password = password;

    }

    /* 3. сделать проверку на имейл*/
    public void addUser(User user) {
        String sub = "@";
        if (email.indexOf(sub) != -1) {
            System.out.println("Email is valid");}
        else {
            System.out.println("Email is invalid");}
    }

}