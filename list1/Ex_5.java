/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list3;

import java.util.ArrayList;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       ArrayList<Integer> v = new ArrayList<>();
       ArrayList<Integer> w = new ArrayList<>();
       v.add(0);
       v.add(1);
       v.add(2);
       v.add(3);
       v.add(4);
       
       v.add(5);
       v.add(6);
       v.add(7);
       v.add(8);
       v.add(9);
       
       v.add(10);
       v.add(11);
       v.add(12);
       v.add(13);
       v.add(14);
       
       v.add(15);
       v.add(16);
       v.add(17);
       v.add(18);
       v.add(19);
       for(int i=0; i < v.size(); i++){
           if((v.get(i) % 2) != 0){
               w.add(v.get(i));
               v.remove(i);
           }
       }
        System.out.println("Pares");
       for(int i=0; i < v.size(); i++){
           System.out.println(v.get(i));
       }
       System.out.printf("\n Impares \n");
        
       for(int i=0; i < w.size(); i++){
           System.out.println(w.get(i));
       }

    }
    
}
