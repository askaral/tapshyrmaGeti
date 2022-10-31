import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{23, 5, 73, 56, 12, 48, 6, 11, 87, 32};
        int counter = 0;
        int b = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == b) {
                System.out.println(" has index number: " + counter);
            }
            counter++;
        }
           for (int j = 0; true; ) {
              if( array[j]!=b) {
                  System.out.println("San jok");
                  break;
              }
        }
        }
    }
       // System.out.println(" There is no such number in the array");


        //System.out.println(" There is no such number in the array");




