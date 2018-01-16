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
public class DecreasingString {
    public static void DecreasingString() {
        Scanner finishNumber = new Scanner(System.in);
        System.out.print("Ievadi beigu skaitli: ");
        int finish = finishNumber.nextInt();
        
        if (finish>0){
        for (int i = 0; i < finish; i++) {
            System.out.print(finish-i + ",");
        }
        }
        else{
            System.out.println("Nulle vai negatīvs skaitlis netiks apstrādāts :p");
        }
    }
}
