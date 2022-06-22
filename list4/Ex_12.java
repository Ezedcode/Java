/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float []array = {10, 3, 7, 4, 1, 0, 18, 68, 5, 25};
        
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Vetor booleano ");
        System.out.print("[");
        for(int j=0; j < arrayDec(array).length; j++)
             System.out.print(" " +arrayDec(array)[j] +" "); 
        System.out.print("]");
    }
    static float[] arrayDec(float []array){ 
        float aux = 0;
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array.length; j++){ 
                if(array[i] > array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}
