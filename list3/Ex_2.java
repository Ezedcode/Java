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
public class Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key =  new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = key.nextLine();
        char c;
        int count = 1;
        
        System.out.println("Quantidade de caracter na string: " + nome.length());
        
        for(int i = 0; i < nome.length(); i++){
         
            if((nome.charAt(i) == ' ') && (nome.charAt(i+1) != ' ')){
                count ++;
            }
        }
        System.out.println("O nome tem "+ count + " palavras");
    }
}
