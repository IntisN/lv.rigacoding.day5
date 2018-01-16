/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day5;

import java.util.Scanner;

/**
 *
 * @author IntisN
 */
public class AlarmClock {
    //String[] weekDay = {"P", "O", "T", "C", "Pk", "Se", "Sv"};
        public static void AlarmClock() {
        Scanner isVacation = new Scanner(System.in);
        System.out.print("Esi atvaļinājumā? 1 = Nē; 2 = Jā: ");
        int vacation = isVacation.nextInt();
        
        Scanner dayNumber = new Scanner(System.in);
        System.out.print("Lūdzu, ievadi nedēļas dienas kārtu: ");
        int day = dayNumber.nextInt();
        
        if (day<6 && vacation == 1){
            if (day == 1){
                System.out.println("Ir pirmdiena, modinātājs skan plkst 07:00. Kraties uz darbu");
            }
            else if (day == 2){
                System.out.println("Ir otrdiena, modinātājs skan plkst 07:00. Kraties uz darbu");
            }
            else if (day == 3){
                System.out.println("Ir trešdiena, modinātājs skan plkst 07:00. Kraties uz darbu");
            }
            else if (day == 4){
                System.out.println("Ir ceturtdiena, modinātājs skan plkst 07:00. Kraties uz darbu");
            }
            else if (day == 5){
                System.out.println("Ir piektdiena, modinātājs skan plkst 07:00. Kraties uz darbu");
            }
        }
        else if (day>6 && vacation == 1){
            if (day == 6){
                System.out.println("Ir sestdiena, modinātājs skan plkst 10:00.");
            }
            else {
                System.out.println("Ir svētdiena, modinātājs skan plkst 10:00.");
            }
        }
        else if (day<6 && vacation == 2){
            if (day == 1){
                System.out.println("Ir pirmdiena, modinātājs skan plkst 10:00.");
            }
            else if (day == 2){
                System.out.println("Ir otrdiena, modinātājs skan plkst 10:00.");
            }
            else if (day == 3){
                System.out.println("Ir trešdiena, modinātājs skan plkst 10:00.");
            }
            else if (day == 4){
                System.out.println("Ir ceturtdiena, modinātājs skan plkst 10:00.");
            }
            else if (day == 5){
                System.out.println("Ir piektdiena, modinātājs skan plkst 10:00.");
            }
        }
        else{
            System.out.println("Šodien guļam un pēc tam ballējamies");
        }
    }
}