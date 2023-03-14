package az.software.village.taskOne.taskTwo.three;

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

        int D = (int) (Math.pow(b,2)-4*a*c);
        if (D>=0){
            double firstVariable = ((-b+Math.sqrt(D))/2*a);
            double secondVariable = ((-b-Math.sqrt(D))/2*a);
            System.out.println("x1 = "+firstVariable+ " x2 = "+secondVariable);

        }

        else
            System.out.println("Diskriminat 0'dan Kicik olanda heqiqi koku olmur");

    }
}
