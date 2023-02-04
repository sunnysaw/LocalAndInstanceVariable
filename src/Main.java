/*
There is some basic confusion that why I'm writing this code just for resolving my own dots.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp = 0 , temp1 = 0;
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        System.out.println("ENTER THE ELEMENT OF ARRAY :");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            temp1 = temp + arr[i];
            System.out.print(" "+ temp1);
        }
        System.out.println();
        System.out.print(" "+ temp1);
        System.out.println();


        for (int i = 0; i < arr.length; i++){
            temp = temp + arr[i];
            System.out.print(" "+ temp);
        }
        System.out.println();
        System.out.print(" "+ temp);
    }
}