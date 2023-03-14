package az.software.village.taskOne.taskFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A deger: ");
        int a = sc.nextInt();
        System.out.print("B deger: ");
        int b = sc.nextInt();
//        boolean compare = (a>b)? true: false;
//        while (compare) {
//            for (int i = b+1; i < a; i++) {
//                int total = (int) Math.pow(i,3);
//                System.out.println(total);
//            }
//            break;


        if (b>a){
            for (double i = a; i < b; i++) {

                if (i%Math.sqrt(i)==0){
                    System.out.println(i);
                }

            }
        }
    }
}
