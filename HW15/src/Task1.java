import java.util.Scanner;

// Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
//      1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
//      Написать двумя способами. If и switch.
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Enter one of this numbers (1,2,3): ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i == 1) {
            System.out.println("Entered: 1");
        } else if(i == 2) {
            System.out.println("Entered: 2");
        } else if(i == 3) {
            System.out.println("Entered: 3");
        } else {
            System.out.println("Incorrect input!");
        }

        switch (i) {
            case 1:
                System.out.println("Entered: 1");
                break;
            case 2:
                System.out.println("Entered: 2");
                break;
            case 3:
                System.out.println("Entered: 3");
                break;
            default:
                System.out.println("Incorrect input!");
        }
    }
}
