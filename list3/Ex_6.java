/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list5;

import java.util.Scanner;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        System.out.print("Enter a int number: ");
        int number = key.nextInt();
        String []array = {"zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String aux = Integer.toString(number);
        
        for(int i=0; i < aux.length(); i++){
            for(int j=0; j < array.length; j++){
                String aux2 = Integer.toString(j);
                if(aux.charAt(i) == aux2.charAt(0)){  
                    System.out.print(array[j]+" ");
                }
            }
        }
    }
    
}
