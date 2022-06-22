/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []array = {"Ezedelio", "Macuete","Garcia"};
        
        System.out.print("[");
        for(int j=0; j < array.length; j++)
            System.out.print(array[j] + " ");
        System.out.println("]");
        
        System.out.printf("\nArray com as 3 primeiras Letras\n");
        System.out.print("[");
        
        for (String threeBegins : threeBegins(array)) {
            System.out.print(threeBegins+ " ");
        }
        System.out.println("]");
    }
    static String[] threeBegins(String []array){
        String []arrayStr = new String[array.length];
        for(int i=0; i < array.length; i++){
            arrayStr[i] = array[i].substring(0,3);
        }
        return arrayStr;
    }
}
