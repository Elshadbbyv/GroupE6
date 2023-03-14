package az.software.village.taskOne.lottery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============Xos Gelmisiniz=============");
        int userEnterValue = sc.nextInt();
        int luckyNumber = (int) (Math.random()*99+1);


        boolean UserEnterKey = userEnterValue >= 10 && userEnterValue < 100;

        while (UserEnterKey){
            if (userEnterValue == luckyNumber){
                System.out.println("Uduslu eded: "+luckyNumber+" Daxil edilen eded: "+userEnterValue+"Tebrikler 5000AZN Qazandiniz");
                break;
            }
            else if ((userEnterValue%10==luckyNumber/10)&&(userEnterValue/10==luckyNumber%10)){
                System.out.println("Uduslu eded: "+luckyNumber+" Daxil edilen eded: "+userEnterValue+" Tebrikler 2500AZN Qazandiniz");
                break;
            }
            else if ((userEnterValue%10==luckyNumber%10)||(userEnterValue/10==luckyNumber/10)){
                System.out.println("Uduslu eded: "+luckyNumber+" Daxil edilen eded: "+userEnterValue+" Tebrikler 1000AZN Qazandiniz");
                break;
            }
            else {
                System.out.println("Uduslu eded: " + luckyNumber + " Daxil edilen eded: " + userEnterValue + " Teesufler olsun ki siz texmin ede bilmediniz");
                break;
            }
        }
    }

}
