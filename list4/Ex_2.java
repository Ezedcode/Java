/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list6;

/**
 *
 * @author angola
 */
public class Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float []array = {1.5f,2.75f,70.9f};
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Soma dos elementos do array: " + somaArray(array));
    }
    static float somaArray(float []array){
        float soma = 0;
        for(int i=0; i < array.length; i++){
          soma += array[i];
        }
        
        return soma;
    }
}
