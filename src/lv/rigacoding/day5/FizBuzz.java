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
public class FizBuzz {
    public static void FizzBuzz() {
        Scanner firstNumber = new Scanner(System.in);
        System.out.print("Ievadiet sākumskaitli: ");
        int first = firstNumber.nextInt();
        
        Scanner secondNumber = new Scanner(System.in);
        System.out.print("Ievadiet beigu skaitli: ");
        int second = secondNumber.nextInt();
        
        if (first<second){
        for (int i = first; i < second+1; i++) {
            if (i % 3 == 0){
                System.out.print("Fizz");
            }
            else if (i % 5 == 0){
                System.out.print("Buzz");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.print("FizzBuzz");
            }
            else {
                System.out.print(i);
            }
        }
        }
        else{
            System.out.println("Sākumskaitlim jābūt lielākam nekā beigu skaitlim");
        }
        System.out.println();
    }
}