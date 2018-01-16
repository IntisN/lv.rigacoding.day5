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
public class RepeatingNumber {
    public static void RepeatingNumber() {
        Scanner finishNumber = new Scanner(System.in);
        System.out.println("Ievadi beigu skaitli: ");
        int finish = finishNumber.nextInt();
        
        if (finish>0){
        for (int i = 1; i < finish+1; i++) {
            for (int b = 1; b < i+1; b++){
            System.out.print(b + ",");
            }
        }
        }
        else{
            System.out.println("Nulle vai negatīvs skaitlis netiks apstrādāts :p");
        }
    }
}
