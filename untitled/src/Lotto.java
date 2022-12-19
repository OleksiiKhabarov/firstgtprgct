import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {


        int arr1[] = new int[7];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(arr1);


        System.out.println("Введіть 7 цифр від 0 до 9: ");
        Scanner sc = new Scanner(System.in);
        int arr2[] = new int[7];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (arr1[i] == arr2[i]) count++;
        }
        System.out.println("Кількість збігів: " + count);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

}