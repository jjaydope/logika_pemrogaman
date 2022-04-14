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
public class berbeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, arr[], i, nilai, l, result = 0;

        String desc = "TIDAK ADA";

        System.out.println("apakah ada bilangan yang sama di array");

        System.out.print("Input N : ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("input " + n + " bilangan");
        for (i = 0; i < n; i++) {
            System.out.print("bilangan[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (l = i + 1; l < n; l++) {
                if (arr[i] == arr[l]) {
                    result++;
                }

            }
        }

        if (result > 0) {
            desc = "ADA";
        }

        String arrValue = Arrays.toString(arr);
        System.out.println("Bilangan yang di input" + arrValue);
        System.out.println("Apakah mungkin? " + desc);
        // TODO code application logic here
    }
    
}
