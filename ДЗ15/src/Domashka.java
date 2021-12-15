import java.util.Scanner;

public class Domashka {
    public static void main(String[] args) {
        /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
      1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
      Написать двумя способами. If и switch. */

        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i==1 || i==2){
        System.out.println(i);}
        
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFiguree = new Scanner(System.in);
        int m = inputFiguree.nextInt();
        switch (m) {
            case 1:
                System.out.println(m);
                break;
            case 2:
                System.out.println(m);
                break;
            case 3:
                System.out.println(m);
                break;
        }

        /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
      5 4 3 2 1 */
        /*Integer a=5;
        System.out.println(a +" " + (a-1)+" " + (a-2)+" " + (a-3)+" " + (a-4));*/

        /*Необходимо вывести на экран таблицу умножения на 3:
        3*1=3
        3*2=6
        3*3=9
        3*4=12
        3*5=15
        3*6=18
        3*7=21
        3*8=24
        3*9=27
        3*10=30*/

        int b=3;
        for (int c=1; c<=10; c++){
            System.out.println(b + "*" + c + "=" + b*c);
        }

        // Найти среднее арефметическое суммы чисел от 1 до 100
        double d=0;
        for (double k=1; k<=100; k++){
                d = d + k;
            if (k==100) {
                System.out.println("среднее арефметическое суммы чисел от 1 до 100: " + d/k);}
        }

    }
}


