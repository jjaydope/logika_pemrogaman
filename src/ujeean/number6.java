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
public class number6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int k, n, arr[], i, l, result = 0;

        String desc = "TIDAK BISA";

        System.out.println("Apakah bisa menjumlahkan 2 angka dari nilai yang diinput?");
        System.out.print("Input K :  ");
        k = scan.nextInt();

        System.out.print("Input N : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Input " + n + " bilangan");
        for (i = 0; i < n; i++) {
            System.out.print("bilangan[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }

       for (i = 0; i < n; i++) {
           for (l = 0; l < n; l++) {
               if (arr[i] != arr[l]) {
                   if (arr[i] + arr[l] == k) {
                       result++;
                   }
                }
           }
        }
        if (result > 0) {
            desc = "BISA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Nilai yang di input :  " + arrValue);
        System.out.println("Apakah mungkin? " + desc);
        // TODO code application logic here
    }
    
}
