/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujeean;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class hugeOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number !! ");
        System.out.println("Number 1 : ");
        int number1 = scan.nextInt();
        System.out.println("Number 2 : ");
        int number2 = scan.nextInt();
        int result = 0;
        
        result= (number2 > number1)? number2:number1;
        System.out.println("Higgest Number :  " +result);
        
    }
    }
    

