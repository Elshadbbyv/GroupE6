package az.software.village.taskOne.taskFive.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("1 deyer: ");
        int a = sc.nextInt();
        System.out.print("2 deyer: ");
        int b = sc.nextInt();
        int first = (int) (Math.random()*((b-a)-1-a));
        int second = (int) (Math.random()*((b-a)-1-a));
        int max = Math.max(first,second);
        int min = Math.min(first,second);
        System.out.println(a +" ve " + b + " araligindaki deyerlerin maximum "+ max+" minimum "+ min);
    }
}
