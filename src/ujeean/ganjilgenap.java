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
public class ganjilgenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input Number : ");
        number = scan.nextInt();
        
        
        if (number % 2 == 0){
            System.out.println(Integer.toString(number) + ": bilangan genap");
        } else {
            System.out.println(Integer.toString(number) + ": bilangan ganjil");
        
        }
    }
    
}
