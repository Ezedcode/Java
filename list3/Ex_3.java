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
public class Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String nome = key.nextLine();
        String part= " ";
        int j=0, aux;
        
        nome += " ";
        
        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
         
            if(c == ' '){
                aux = j;
                j = i+1;
                String nomeAux = nome.substring(aux, j);
             
                if("e ".equalsIgnoreCase(nomeAux)){
                }else if("do ".equalsIgnoreCase(nomeAux)){
                }else if("da ".equalsIgnoreCase(nomeAux)){
                }else if("dos ".equalsIgnoreCase(nomeAux)){
                }else if("das ".equalsIgnoreCase(nomeAux)){
                }else if("de ".equalsIgnoreCase(nomeAux)){
                }else if("di ".equalsIgnoreCase(nomeAux)){
                }else if("du ".equalsIgnoreCase(nomeAux)){
                }else{
                    char b = nomeAux.charAt(0);
                    part += String.valueOf(b);
                }        
            }
        }
   
        part = part.toUpperCase();
        System.out.println("Iniciais: " + part);
    }
    
}
