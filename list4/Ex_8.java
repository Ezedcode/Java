/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []array = { 5, 7, 8,9, 10};
        
         System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Vetor inverso ");
        System.out.print("[");
        for(int j=0; j < reverse(array).length; j++)
             System.out.print(" " +reverse(array)[j] +" "); 
        System.out.print("]");
        
    }
    static int[] reverse(int []array){
        int aux[] = new int[array.length];
        int j = 0;
        for(int i=array.length-1; i >= 0; i--){
            aux[j] = array[i];
            j++;
        }
        return aux;
    }
}
