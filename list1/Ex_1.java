/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list3;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
       int v[] = {1, 2, 3, 4, 5};
       int w[] = new int[v.length];
       
      for(int i=0; i<5; i++){
          w[i]= v[i];
          
      }
        System.out.println("v = w");
      for(int i=0; i<5; i++){
          System.out.println(v[i]+" = "+ w[i]);
      }
    }
    
}
