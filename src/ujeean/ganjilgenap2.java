/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujeean;

/**
 *
 * @author MOKLET-1
 */
public class ganjilgenap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bilangan ganjil-genap");
        System.out.println("");
        System.out.println("5, 6, 1, 3, 5");
        int [] number = {5, 6, 1, 3, 5};
        System.out.print("=> [");
        for(int a=0; a<5; a++){
            if(number[a] %2 == 0){
                System.out.print("Genap,");
            }
            else{
                System.out.print("Ganjil,");
            }  
        }
        
        System.out.println("]");
    }
    
}


    
    

