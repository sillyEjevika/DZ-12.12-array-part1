import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание №1
        System.out.println("Задача №1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        double[] fractional = {1.57, 7.654, 9.986};
        System.out.println(fractional[0]);
        System.out.println(fractional[1]);
        System.out.println(fractional[2]);
        int[] arbitrary = {132, 45, 90, 0, 0, 0};
        for (int i = 0; i < 6; i++) {
            System.out.println(arbitrary[i]);
        }

        // Задание №2
        System.out.println("Задача №2");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        System.out.print(array[0]);
        System.out.print(", ");
        System.out.print(array[1]);
        System.out.print(", ");
        System.out.print(array[2]);
        System.out.println();
        double[] fractional1 = {1.57, 7.654, 9.986};
        System.out.print(fractional1[0]);
        System.out.print(", ");
        System.out.print(fractional1[1]);
        System.out.print(", ");
        System.out.print(fractional1[2]);
        System.out.println();
        int[] arbitrary1 = {132, 45, 90, 0, 0, 0};
        for (int i = 0; i < 6; i++) {
            System.out.print(arbitrary1[i]);
            System.out.print(", ");
        }
        // Задание №3
        System.out.println("Задача №3");
        int[] array2 = {1, 2, 3};
        for (int i = 2; i >= 0; i--) {
            System.out.print(array2[i]);
            System.out.print (", ");
        }
        System.out.println();
        double[] fractional2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >=0 ; i--) {
            System.out.print(fractional2[i]);
            System.out.print (", ");
        }
        System.out.println();
        int[] arbitrary2 = {132, 45, 90, 0, 0, 0};
        for (int i = 5; i >=0 ; i--) {
            System.out.print(arbitrary2[i]);
            System.out.print (", ");
        }
        System.out.println();
        // Задание №4
        System.out.println("Задача №4");
        int [] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) ; {
                arr[i]+=1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}