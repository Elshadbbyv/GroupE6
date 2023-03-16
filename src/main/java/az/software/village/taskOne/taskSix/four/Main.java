package az.software.village.taskOne.taskSix.four;

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
        System.out.print("D deger: ");
        int d = sc.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(c,d);
        System.out.println("Max ve Min Hasili"+(max*min));

    }
}
