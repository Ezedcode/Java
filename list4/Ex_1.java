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
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []array = {1,2,60,70};
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Soma dos elementos que sao superiores a 50 : " + somaArray(array));
        
    }
    
    static int somaArray(int []array){
        int soma = 0;
        for(int i=0; i < array.length; i++){
            if(array[i] > 50){
                soma += array[i];
            }
        }
        
        return soma;
    }
}
