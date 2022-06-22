/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list3;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int w[]= new int [15];
        int v[]= new int[15];
        System.out.println("w -> v^2");
        for(int i=0; i<15; i++){
            w[i]= i;
            v[i]= (int) Math.pow(w[i],2);
            System.out.println(w[i]+" -> "+v[i]);
        }
    }
    
}
