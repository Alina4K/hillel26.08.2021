package User;

public class Users {
   public String name;
   public String last_name;
   public String email;
   public String password;

//первый способ создания
   public Users (String name, String last_name, String email, String password){
      this.name = name;
      this.last_name= last_name;
      this.email=email;
      this.password=password;
   }
//второй способ создания
  /* public Users(String email, String password) {
      this.email= email;
      this.password = password;
   }*/
       public boolean containsEmail (String email){
      for (int i=0; i<email.length();i++){
          if (email.charAt(i)== '@' ) return true;
       }
      return false;
    }

}
