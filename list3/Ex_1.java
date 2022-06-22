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
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
       Scanner key = new Scanner(System.in);
       System.out.print("Digite uma String: ");
       String string = key.nextLine();
       int count = 0;
       
       System.out.println("a. A string tem " + string.length() + " caractere");
       string = string.toUpperCase(); 
       System.out.println("b. "+ string);
       
       for (int i = 0; i < string.length(); i++){
           char c = string.charAt(i);
           if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
               count ++;
           }
           if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
               count ++;
           }  
       }
       
       System.out.println("c. A string tem "+ count +" vogais");
       
       if ("ISP".equalsIgnoreCase(string.substring(0, 3))){
            System.out.println("d. A string começa com ISP");
       }
       if ("IOR".equalsIgnoreCase(string.substring((string.length()-3), string.length()))){
            System.out.println("e. A string termina com IOR");
       }   
    } 
}
