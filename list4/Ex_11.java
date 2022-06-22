/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []array = {1,-2,3,4,-5,-8,19,-21,21, -24, -23, -35};
        
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Vetor booleano ");
        System.out.print("[");
        for(int j=0; j < trueAndfalse(array).length; j++)
             System.out.print(" " +trueAndfalse(array)[j] +" "); 
        System.out.print("]");
    }
    static boolean[] trueAndfalse(int []array){
        boolean []arrayB = new boolean[array.length];
        for(int i=0; i < array.length; i++){
            if(array[i] > 0){
                arrayB[i] = true;
            }else{
                arrayB[i] = false;
            }
        }
        
        return arrayB;
    }
}
