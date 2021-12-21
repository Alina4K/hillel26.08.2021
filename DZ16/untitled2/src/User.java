public class User {
    public String firstName;
    public String lastName;
    public String email;
    public String password;

    public User(String firstMame, String lastName, String email, String password) {
        this.firstName = firstMame;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public void Info() {
        System.out.println("");
        System.out.println("Данные пользователя: ============");
        System.out.println("Имя: " + this.firstName);
        System.out.println("Фамилия: " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("=================================");

    }
}


