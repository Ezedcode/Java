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
public class Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        
        System.out.print("Enter a frase: ");
        String sentence = key.nextLine();
        sentence += " ";
        System.out.print("Enter the word wish you to replace: ");
        String word = key.nextLine();
        
        int count=0, prev=0;
        for(int i=0; i < sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                if(word.equalsIgnoreCase(sentence.substring(prev,count))){
                    System.out.print("Enter the word which you want to replace to: ");
                    String replaceWord = key.nextLine();
                    System.out.println("");
                    System.out.println(sentence.replace(word, replaceWord));
                }
                prev =  count + 1;
            }
            count++;
        }
    }
    
}
