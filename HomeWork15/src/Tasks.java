import java.util.Scanner;

public class Tasks {
    /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
       1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
       Написать двумя способами. If и switch.
       */
    /*public static void main(String[] args){
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if ( i==1) {
            System.out.println("Вы ввели число 1");
        }
            else if (i==2) {
                System.out.println ("Вы ввели число 2");
            }
            else if (i==3) {
                System.out.println ("Вы ввели число 3");
            }
            else {
                System.out.println ("Неверное число");}
        System.out.println(i);
    } */
   /* public static void main(String[] args) {
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int b = inputFigure.nextInt();
        switch (b) {
        case 1: System.out.println("Вы ввели число 1"); break;
        case 2: System.out.println("Вы ввели число 2"); break;
        case 3: System.out.println("Вы ввели число 3"); break;
        default:        System.out.println("Неверное число");  }
    } */


    /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
      5 4 3 2 1   */
    /*public static void main(String[] args){
       for (int c=5; c >= 1; c--) {
           System.out.print (c + " ");
       }
    }*/

   /* Необходимо вывести на экран таблицу умножения на 3 */
   /* public static void main(String[] args){
         for (int i=1; i <=10; i++)
            System.out.println ("3 * " +i + " = " + 3*i);
    }*/

    /* Найти среднее арефметическое суммы чисел от 1 до 100 */
    public static void main(String[] args){
        float sum = 0;
		for (int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		System.out.println ("Среднее арифметические = " +(sum/100));
    }

}
