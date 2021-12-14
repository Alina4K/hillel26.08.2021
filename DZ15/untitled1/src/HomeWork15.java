    import java.util.Scanner;

    public class HomeWork15 {
    public static void main(String[] args) {

  // №1

        // через if
        /*
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if (i == 1) {
            System.out.println("Вы выбрали число один (1)");
        }
        else if (i == 2) {
            System.out.println("Вы выбрали число два (2)");
        }
        else if (i == 3) {
            System.out.println("Вы выбрали число три (3)");
        }
        else {
            System.out.println("Вы выбрали неправильное число");
        }

        System.out.println (i);
        */

        // через switch
        /*
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        switch (i) {
            case 1 -> System.out.println("Вы выбрали число один (1)");
            case 2 -> System.out.println("Вы выбрали число два (2)");
            case 3 -> System.out.println("Вы выбрали число три (3)");
            default -> System.out.println("Вы выбрали неправильное число");
        }
        */

  // №2

        // цикл для получения от 5 до 1
         /*
        for (int i = 5; i >= 1; i--) {
            System.out.print (i + "," + " ");
         }
          */

  // №3

        // Необходимо вывести на экран таблицу умножения на 3:
         /*
        System.out.println("Таблица умножения числа три:");
        for (int i = 1; i <= 10; i++)
            System.out.println("3*" + i + "=" + 3*i);
        */

  // № 4
        // среднее значение суммы чисел от 1 до 100
        /*
        System.out.println("Среднее значение суммы чисел от 1 до 100: ");
        // используем "double", чтобы вывести остаток числа (0.5)
        double[] numbers = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 ,
                21 , 22 , 23 , 24 , 25 , 26 , 27 , 28 , 29 , 30 , 31 , 32 , 33 , 34 , 35 , 36 , 37 , 38 , 39 , 40 , 41 ,
                42 , 43 , 44 , 45 , 46 , 47 , 48 , 49 , 50 , 51 , 52 , 53 , 54 , 55 , 56 , 57 , 58 , 59 , 60 , 61 , 62 ,
                63 , 64 , 65 , 66 , 67 , 68 , 69 , 70 , 71 , 72 , 73 , 74 , 75 , 76 , 77 , 78 , 79 , 80 , 81 , 82 , 83 ,
                84 , 85 , 86 , 87 , 88 , 89 , 90 , 91 , 92 , 93 , 94 , 95 , 96 , 97 , 98 , 99 , 100};
        double result = 0;

        for (double i : numbers) {
            result += i;
        }

        System.out.println("Среднее арифметическое: " + result / numbers.length);
         */
    }
}