/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujeean;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class fruity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, index,  jum[], max;
        String fruit[], fruitMax = null;

        Scanner scan = new Scanner(System.in);

        System.out.println("========== Menentukan Buah Terbanyak ==========\n");

        System.out.print("Inputkan jumlah buah : " );
        index = scan.nextInt();
        fruit = new String[index];
        jum = new int[index];

        System.out.println("\nMasukkan " + index + " buah");
        for (i = 0; i < index; i++) {
            System.out.print("Buah[" + (i) + "]             : ");
            fruit[i] = scan.next();
            
            System.out.print("Jumlah              : ");
            jum[i] = scan.nextInt();
            
            System.out.println("");
        }
        
        System.out.println("Data Buah");
        max = jum[0];
        fruitMax = fruit[0];
        for(i = 0; i < index; i++){
            System.out.print(fruit[i] +  " = " + jum[i] + "\n");
            if(jum[i] > max){
                fruitMax = fruit[i];
            }
        }   
        System.out.println("\nBuah terbanyak = " +  fruitMax);
    }
}