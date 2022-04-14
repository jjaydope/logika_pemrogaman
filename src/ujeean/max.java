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
public class max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
        int max, n, arr[], i;

        System.out.println("Determine the higgest number !");

        System.out.print("Input value (N): ");
        n = scan.nextInt();
        arr = new int[n];

        System.out.println("Input " + n + " number");
        for (i = 0; i < n; i++) {
            System.out.print("number[" + (i) + "] : ");
            arr[i] = scan.nextInt();
        }
        
        max = arr[0];
        for(i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        String arrValue = Arrays.toString(arr);
        System.out.println("Inputed Array" + arrValue);
        System.out.println("The higgest number is " + max);
    }
    }