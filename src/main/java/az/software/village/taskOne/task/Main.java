package az.software.village.taskOne.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("A deger: ");
        int a = sc.nextInt();
        System.out.print("B deger: ");
        int b = sc.nextInt();


        int max = (a>b) ? a: b;
        int min = (a>b) ? b: a;
        System.out.println("Daxil Edilmis Ededlerin max: "+max);
        System.out.println("Daxil Edilmis Ededlerin min: "+min);
    }
}
