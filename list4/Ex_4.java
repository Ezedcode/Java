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
public class Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int []array = {1,2,60,70, 8, 4};
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Vetor de numeros pares ");
        System.out.print("[");
        for(int j=0; j < pairArray(array).length; j++)
             System.out.print(" " +pairArray(array)[j] +" "); 
        System.out.print("]");
    }
    
    static int[] pairArray(int []array){
        int soma = 0, countpair = 0;
        for(int i=0; i < array.length; i++){
            if((array[i] % 2) == 0){
                countpair++;
            }
        }
        int []arraypair = new int[countpair];
        
        for(int i=0, j=0; i < array.length; i++){
            if((array[i] % 2) == 0){
                arraypair[j] = array[i];
                j++;
            }
        }
        
        return arraypair;
    }
}
