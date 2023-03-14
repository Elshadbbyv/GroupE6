package az.software.village.taskOne.taskTwo.one;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A deger: ");
        int a = sc.nextInt();
        System.out.print("B deger: ");
        int b = sc.nextInt();
        System.out.print("C deger: ");
        int c = sc.nextInt();

        int result = (int) ((c>a)?((c<b)? Math.pow(c,3): 0):((c>b)? Math.pow(c,3): 0));
        switch (result) {
            case 0:
                System.out.println("Values isn't among A and B");
                break;
            default:
                System.out.println(result);
                break;
        }
    }
}
