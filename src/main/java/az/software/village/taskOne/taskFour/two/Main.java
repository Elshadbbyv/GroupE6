package az.software.village.taskOne.taskFour.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ilk deyer: ");
        int a = sc.nextInt();
        System.out.print("Son deyer: ");
        int b = sc.nextInt();



        if (b>a){
            for (double i = a; i < b; i++) {

                if (i%Math.sqrt(i)==0){
                    System.out.println(i);
                }

            }
        }
    }
}
