package az.software.village.taskOne.taskFour.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("deyer: ");
        int a = sc.nextInt();
        int i = 2;
        while (i<a){
            boolean result = a%i==0? true:false;
            ++i;
            if (result == true){
                System.out.println(a+ " ededi Murekkebdir");
                break;}
            else {
                System.out.println(a + " ededi Sadedir");
                break;
            }
        }



    }
}
