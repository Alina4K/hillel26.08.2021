package users;

public class User1 {

    private String Name;
    private String LastName;
    private String Email;
    private String Password;
    private String ReEnterPassword;


    public User1(String Name, String Last_Name, String email, String password, String Reenter_password) {
        this.Name = Name;
        this.LastName = Last_Name;
        this.Email = email;
        this.Password = password;
        this.ReEnterPassword = Reenter_password;

}

    public void Validation(){
        int DogSymvol = 0;

        for (int i = 0; i < Email.length(); i++) {
            if (Email.charAt(i) == '@')
                DogSymvol++;
        }
        if (DogSymvol==1) {
            System.out.println("Valid email address User1");
        } else {
            System.out.println("Invalid email address User1");
        }
    }
}