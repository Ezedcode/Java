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
public class Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float []array = {5,7,10,7,1};
        float []array2 = {5,3,6,3,1};
        
        for(int i=0; i < array.length; i++)
            System.out.println((int)array[i]+" * "+(int)array2[i]+" = "+(int)eachMultArray(array, array2)[i]);
        
        System.out.println("vector com as multiplicações entre cada dois elementos");
        System.out.print("[");
        for(int j=0; j < eachMultArray(array, array2).length; j++)
            System.out.print(" "+(int)eachMultArray(array, array2)[j]+" ");
        System.out.println("]");
        
    }
    static float[] eachMultArray(float []array, float []array2){
        float soma = 0;
        float []array3 = new float[array.length];
        for(int i=0; i < array.length; i++){
          array3[i] = array[i] * array2[i];
        }
        
        return array3;
    }
}
