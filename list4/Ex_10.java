package list6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String []array = {"Dinog","Ezedelio", "Macuete","Garcia"};
        
        System.out.print("[");
        for (String array1 : array) {
            System.out.print(array1 + " ");
        }
        System.out.println("]");
        
        System.out.println("Array cujo numero de strings é Impar");
        System.out.print("[");
        for(int i=0; i < EvenArray(array).length; i++){
           System.out.print(EvenArray(array)[i] + " ");
        }
        System.out.println("]");
    }
    
    static String[] EvenArray(String []array){
        int count=0;
        int j=0;
        for(int i=0; i < array.length; i++){
           if((array[i].length() % 2) != 0){
               count++;
           }
        }
        String []arrayEven = new String[count];
        
        for(int i=0; i < array.length; i++){
           if((array[i].length() % 2) != 0){
               arrayEven[j] = array[i];
               j++;
           }
        }
        
        return arrayEven;
    }
    
}