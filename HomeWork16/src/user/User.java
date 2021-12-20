package user;


public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;


    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;


        int sobaka = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                sobaka++;
        }
        if (sobaka == 1) {
            System.out.println("Создан юзер: " + name);
        } else {
            System.out.println("Ваш email не верный ");
        }
    }
}









