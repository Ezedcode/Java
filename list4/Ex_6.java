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
public class Ex_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []array = {"Ezedelio", "Macuete","Garcia"};
        
        System.out.print("[");
        for(int j=0; j < upperArray(array).length; j++)
            System.out.print(array[j] + " ");
        System.out.println("]");
        
        System.out.println("Array com as strings em maiúsculas");
        System.out.print("[");
        
        for (String upperArray : upperArray(array)) {
            System.out.print(upperArray + " ");
        }
        System.out.println("]");
    }
    
    static String[] upperArray(String []array){
        String []array2 = new String[array.length];
        for(int i=0; i < array.length; i++){
            array2[i] = array[i].toUpperCase();
        }
        return array2;
    }
}
