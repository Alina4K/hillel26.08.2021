package Users;

public class User {
    public String firstName;
    public String lastName;
    public String email;
    public String password;

    public User(String email, String password)  {
        boolean isEmailValid = CheckEmail(email);
        boolean isPasswordValid = password.length() > 0;

        try {
            if (isEmailValid && isPasswordValid) {
                this.email = email;
                this.password = password;
                ShowResult("Пользователь зарегистрирован");
            } else {
                if (!isEmailValid) throw new Error("Email не валидный");
                if (!isPasswordValid) throw new Error("Введите пароль");
            }
        } catch (Error error) {
            System.err.println("Ошибка регистрации: " + error.getMessage());
        }


    }

    public User(String email, String password, String firstMame, String lastName) {
        boolean isEmailValid = CheckEmail(email);
        boolean isPasswordValid = password.length() > 0;
        boolean isFirstNameValid = firstMame.length() > 0;
        boolean isLastNameValid = lastName.length() > 0;

        try {
            if (isEmailValid && isPasswordValid && isFirstNameValid && isLastNameValid) {
                this.email = email;
                this.password = password;
                this.firstName = firstMame;
                this.lastName = lastName;
                ShowResult("Пользователь зарегистрирован");
            } else {
                if (!isEmailValid) throw new Error("Email не валидный");
                if (!isPasswordValid) throw new Error("Введите пароль");
                if (!isFirstNameValid) throw new Error("Имя отсуствует");
                if (!isLastNameValid) throw new Error("Фамилия отсуствует");
            }
        } catch (Error error) {
            System.err.println("Ошибка полной регистрации: " + error.getMessage());
        }
    }

    private static boolean CheckEmail(String email){

        char[] letters = new char[email.length()];
        boolean isValid = false;

        for (int i = 0; i < email.length(); i++) {
            letters[i] = email.charAt(i);
        }

        for (int i = 0; i < email.length(); i++) {
            char currentLetter = letters[i];
            if(currentLetter=='@') {
                isValid = true;
                break;
            }
        }

        return isValid;
    }

    static void ShowResult(String message){
        System.out.println(message);
    }


}

