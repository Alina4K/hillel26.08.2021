package NewUser;


import utils.Utils;

public class User {
    public String name = "";
    public String last_name = " ";
    private String email = "";
    private String password = "";


    public User(String email, String password, String name, String last_name) {
        if (Utils.containsDog(email))
            this.email = email;
        else System.out.println("Not Valid Email");
        this.password = password;
        this.name = name;
        this.last_name = last_name;

        System.out.println("Something wrong");
    }

    public User(String email, String password, String repassword) {


        if (Utils.containsDog(email))
            this.email = email;
        else System.out.println("Not Valid Email");
        this.password = password;
    }

}














