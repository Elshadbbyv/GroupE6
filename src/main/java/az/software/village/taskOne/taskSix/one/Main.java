package az.software.village.taskOne.taskSix.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<=5){
            System.out.print("Hefte Ici");
            switch (a){
                case 1:
                    System.out.println("Bazar Ertesi");
                case 2:
                    System.out.println("Cersenbe Axsami");
                case 3:
                    System.out.println("Cersenbe");
                case 4:
                    System.out.println("Cume Axsami");
                case 5:
                    System.out.println("Cume");
            }
        }
        else if (a>5&&a<=7){
            switch (a){
                case 6:
                    System.out.println("Senbe");

                case 7:
                    System.out.println("Bazar ");
            }
        }
        else
            System.out.println("Hefte 7 gunden ibaretdir");


    }
}
