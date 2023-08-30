import java.util.Random;
import java.util.Scanner;

/**
 * @author 1ommy
 * @version 30.08.2023
 */
public class Main {
    public static void main(String[] args) {
        double a = 5.0;
        int e = 7;
        double b = 2.0;
        float c = 3.7f;
        String str = "My age is: ";
        char ch = 'A';
//        System.out.println(a / e);

        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();

        String a1 = "Ivan";
        String a2 = new String("Ivan");
        String a3 = "Ivan";

//        System.out.println(a1 == a2);
//        System.out.println(a1 == a3);
//        System.out.println(a2 == a3);
//        System.out.println(a1.equals(a2));

//        boolean b1 = false;
//        System.out.println(b1);
//        System.out.println(!b1);

//        if (== < > != !) {
//            System.out.println(1);
//        } else {
//            System.out.println(2);
//        }

//        int age = sc.nextInt();
//        System.out.println("My name is " + name + " and age is " + age);

//        try {
//            String name = sc.nextLine();
//            int age = sc.nextInt();
//            System.out.println("My name is " + name + " and age is " + age);
//        } catch (Exception exception) {
//            System.out.println("Упс,ты ввел не число, а какую-то хрень");
//        }

//        System.out.println("Ура!работаем дальше");
        Scanner scanner = new Scanner(System.in);
//        int size = -1;
//        boolean isInputCorrect;
//
//        do {
//            isInputCorrect = true;
//            try {
//                size = scanner.nextInt();
//            } catch (Exception exception) {
//                System.out.println("Введите число!");
//                isInputCorrect = false;
//            }
//        } while (isInputCorrect == false);

//        System.out.println(size);

//        1, 5, -123, -700, 8,9,4
//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 5;
//        array[2] = -123;
//        array[3] = -700;
//        array[4] = 8;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        int n = 48;
//        int ostatokSecund = n - (n / 3600) * 3600;
//        System.out.println(ostatokSecund);
//        System.out.println(ostatokSecund / 60);
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 48; i++) {
//            if (n % i == 0) {
//                sum += i;
//                count += 1;
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);
//        System.out.println(105 % 10);
//
//        int n = 199512313;
//        int count = 0;
//
//        while (n > 0) {
//            count += 1;
//            n /= 10;
//        }
//
//        System.out.println(count);
        Random random = new Random();
        int k = 0;
        int[][] d2array = new int[3][4];
        for (int i = 0; i < d2array.length; i++) {
            for (int j = 0; j < d2array[0].length; j++) {
                d2array[i][j] = k++;
            }
        }
        for (int i = 0; i < d2array.length; i++) {
            for (int j = 0; j < d2array[0].length; j++) {
                System.out.print(d2array[i][j] + " ");
            }
            System.out.println();
        }

    }
}