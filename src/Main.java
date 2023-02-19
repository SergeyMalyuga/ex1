import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива!");
        Scanner answer = new Scanner(System.in);
        int number = answer.nextInt();
        int [] are = new int [number];
        arrayRandom(are);
        bubbleSorted(are);


    }

    public static void arrayRandom(int [] are) {
        int length = are.length;

        for (int i = 0; i < length; i++) {
            int j = new Random().nextInt(1, 100);
            are[i] = j;
        }

        for (int a : are) {
            System.out.println(a);
        }
        System.out.print("\n" + length);
    }

    public static void bubbleSorted (int [] are) {
        System.out.println ("\n");
        int length = are.length;
        for (int j = 0; j < length - 1; j++) {
            for (int i = 0; i < length-1 ; i++) {
                if (are[i] > are[i + 1]) {
                    int temp = are[i];
                    are[i] = are[i + 1];
                    are[i + 1] = temp;
                    System.out.println(Arrays.toString(are));

                }
            }
        }
    }
}




