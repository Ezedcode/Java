/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []array = {"Ezedelio", "Macuete","Garcia"};
        String []array2 = {"Ezedelio", "Garcia"};
        
        System.out.print("[");
        for(int j=0; j < array.length; j++)
            System.out.print(array[j] + " ");
        System.out.print("]");
        
        System.out.print(" e [");
        for(int j=0; j < array2.length; j++)
            System.out.print(array2[j] + " ");
        System.out.println("]");
        
        System.out.printf("\nArray que as strings em comum\n");
        System.out.print("[");
        
        for (String threeBegins : sameStr(array, array2)) {
            System.out.print(threeBegins+ " ");
        }
        System.out.println("]");
    }
    static String[] sameStr(String []array, String []array2){
        int count=0, k=0;
        
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array2.length; j++){
                if(array[i].equalsIgnoreCase(array2[j])){
                    count++;
                }
            }
        }
        String []sameArray = new String[count];
        
        for(int i=0; i < array.length; i++){
            for(int j=0; j < array2.length; j++){
                if(array[i].equalsIgnoreCase(array2[j])){
                    sameArray[k] = array[i];
                    k++;
                }
            }
        }
        
        return sameArray;
    }
}
