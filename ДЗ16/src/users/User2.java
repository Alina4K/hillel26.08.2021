package users;

public class User2 {

    private String Email;
    private String Password;
    private String ReEnterPassword;


        public User2 (String email, String password, String Reenter_password) {
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
            System.out.println("Valid email address User2");
        } else {
            System.out.println("Invalid email address  User2");
        }
        }
    }