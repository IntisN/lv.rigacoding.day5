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
public class SpeedCamera {
        public static void SpeedCamera() {
        Scanner isBirthday = new Scanner(System.in);
        System.out.println("Vai ir dz/d? 1 ir jā; jebkurš cits ir NĒ!: ");
        int birthday = isBirthday.nextInt();
        
        Scanner recordedSpeed = new Scanner(System.in);
        System.out.println("Kāds ir fiksētais ātrums?: ");
        int speed = recordedSpeed.nextInt();
        
        if (speed<=60){
                System.out.println("Droši brauc tālāk");
            }
        else {
        if (birthday == 1){
            speed = speed-5;
            if (speed>=80){
                System.out.println("Tiesības nost!");
            }
            else{
                System.out.println("Sodiņš jāmaksā!");
            }
        }
        else{
            if (speed>=80){
                System.out.println("Tiesības nost!");
            }
            else{
                System.out.println("Sodiņš jāmaksā!");
            }
        }
        }
    }
}
