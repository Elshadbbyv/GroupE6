package az.software.village.taskOne.taskFive.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Baslangic deyer: ");
        int a = sc.nextInt();
        System.out.print("Son deyer: ");
        int b = sc.nextInt();
        System.out.print("Random sayi: ");
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int k = (int) (Math.random()*((b-a)+a));
            System.out.println(k);

        }
    }
}
