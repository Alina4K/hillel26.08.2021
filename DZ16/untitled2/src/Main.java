import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UserRegister();
        CarRegister();
    }

    static void UserRegister() {
        System.out.println("Каким методом создать юзера? Только email и пароль обязательны - 1, Все поля обязательны - any nubKey");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы выбрали - Только email и пароль обязательны");
                UserRegisterFirst();
                break;

            default:
                System.out.println("Вы выбрали - Все поля обязательны");
                UserRegisterSecondAll();
                break;
        }
    }

    static boolean CheckEmail(String email){

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

    static void UserRegisterFirst() {
        String candidateFirstName = "Oleg";
        String candidateLastName = "Chernianu";
        String candidateEmail = "olegc@hegmail.com";
        String candidatePassword = "qwer45";

        boolean isEmailValid = CheckEmail(candidateEmail);
        boolean isPasswordValid = candidatePassword.length() > 0;

        if (isEmailValid && isPasswordValid) {
            User OlegUser1 = new User(candidateFirstName, candidateLastName, candidateEmail, candidatePassword);
            OlegUser1.Info();
        } else {
            if (!isEmailValid) System.out.println("Email не валидный: " + candidateEmail);
            if (!isPasswordValid) System.out.println("Пароль не валидный " + candidatePassword);
        }
    }

    static void UserRegisterSecondAll() {
        String candidateFirstName = "Олег";
        String candidateLastName = "Che";
        String candidateEmail = "oleg@chegmail.com";
        String candidatePassword = "qwer45";

        boolean isEmailValid = CheckEmail(candidateEmail);
        boolean isPasswordValid = candidatePassword.length() > 0;
        boolean isFirstNameValid = candidateFirstName.length() > 0;
        boolean isLastNameValid = candidateLastName.length() > 0;

        if (isEmailValid && isPasswordValid && isFirstNameValid && isLastNameValid) {
            User OlegUser2 = new User(candidateFirstName, candidateLastName, candidateEmail, candidatePassword);
            OlegUser2.Info();
        } else {
            if (!isEmailValid) System.out.println("Email не валидный: " + candidateEmail);
            if (!isPasswordValid) System.out.println("Пароль не валидный " + candidatePassword);
            if (!isFirstNameValid) System.out.println("Имя отсуствует: " + candidateFirstName);
            if (!isLastNameValid) System.out.println("Фамилия отсуствует: " + candidateLastName);
        }
    }

    static void CarRegister() {
        int candidateCarMillage = 99999;
        if (candidateCarMillage <= 999999){
            Car MiniCooper = new Car("MINI", "Cooper S", candidateCarMillage);
            MiniCooper.Info();
        } else {
            System.out.println("Пробег слишком большой: " + candidateCarMillage);
        }

        Countryman CarCountryman = new Countryman("MINI", "Countryman JCW All 4", 999999, 300);

        if(CarCountryman.milleage >= 999999) {
            CarCountryman.Info();
        }
        else {
            System.out.println("Пробег слишком большой: " + CarCountryman.milleage);
        }

        if(CarCountryman.speed > 300) {
            CarCountryman.Stop();
        }
        else {
            System.out.println("Скорость: " + CarCountryman.speed);
        }

    }
}
