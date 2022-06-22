/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

import java.util.Scanner;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key =new Scanner(System.in);
        float []array = {1,2,3,4,5};
        System.out.print("Digite um numero: ");
        float number = key.nextFloat();
        
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Vetor com os elemento multiplicados por a ");
        System.out.print("[");
        for(int j=0; j < arrayMultA(array, number).length; j++)
             System.out.print(" " +arrayMultA(array, number)[j] +" "); 
        System.out.print("]");
    }
    static float[] arrayMultA(float []array, float number){
        float aux[] = new float[array.length];
        for(int i=0; i < array.length; i++){
            aux[i] = (array[i] * number);
        }
        return aux;
    }
}
