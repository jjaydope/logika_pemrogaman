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
public class jumlah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int number1,number2,result;
       
        System.out.print("Number 1\t:");  
        number1=input.nextInt();         
       
        System.out.print("Number 2\t:"); 
        number2=input.nextInt();     
   
        result=number1+number2;  
       
        System.out.println("\nResult :");
        System.out.println(number1+" + "+number2+" = "+result);
    }
    
}
