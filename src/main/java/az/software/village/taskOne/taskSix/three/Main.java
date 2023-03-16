package az.software.village.taskOne.taskSix.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a+" cut ededdir");
        }
        else if (a ==0 || a==1) {
            System.out.println(a+"Ne cut ne de tekdir");
        }
        else
            System.out.println(a+" tek ededdir");
    }
}
