package az.software.village.taskOne.taskTwo.two;

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
        if((a+b)>(c+d)){
            System.out.println(a+" ile "+ b +"cemi > (boyukdur) "+c+" " +d+"den");
        }
    }
}
