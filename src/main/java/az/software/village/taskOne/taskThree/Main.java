package az.software.village.taskOne.taskThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        //Loop Tasks
//        for (int i = 0; i <a ; i++) {
//            for (int j = a; j >i ; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println();}
        for (int i = 0; i < a; i++) {
            for (int k = a; k > i ; k--) {
                System.out.print(" ");
            }for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
