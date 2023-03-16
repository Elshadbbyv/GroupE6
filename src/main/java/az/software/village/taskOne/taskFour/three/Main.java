package az.software.village.taskOne.taskFour.three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ilk deyer: ");
        int a = sc.nextInt();
        System.out.print("Son deyer: ");
        int b = sc.nextInt();
        int ebob = 1;
        int ekob;
        for(int i = 1; i <= a && i <= b; ++i)
        {
            if(a % i == 0 && b % i == 0)
                ebob = i;
        }
        ekob = (a * b) / ebob;
        System.out.printf(" %d ve  %d EBOB:  \n", a, b, ebob);
        System.out.printf(" %d ve  %d EKOB: %d \n", a, b, ekob);
    }
}

