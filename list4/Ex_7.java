/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float []array = {23,7,17,7,1};
        System.out.print("[");
        for(int i=0; i < array.length; i++)
             System.out.print(" " + array[i]+" ");
        System.out.println("]");
        System.out.println("Position que contem o maior numero: " + position(array));
    }
    static int position(float []array){
        int n=0, count = 0;
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array.length; j++){
                if(array[i] > array[j]){
                    n = i;
                    count++;
                }
            }
            if (count == array.length-1){
                return n;
            }
            count = 0;
        }
        
        return n;
    }
        
}
