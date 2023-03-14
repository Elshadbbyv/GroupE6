package az.software.village.taskOne.taskFive.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Baslangic deyer: ");
        int a = sc.nextInt();
        System.out.print("Son deyer: ");
        int b = sc.nextInt();
        System.out.print("Random sayi: ");
        int c = sc.nextInt();
        int max = 0;
        for (int i = 0; i < c; i++) {
            int random = (int) (Math.random()*((b-a)-1-a));

            if (max>random){
                System.out.println(max);
            }
            max=random;


        }
    }
}
