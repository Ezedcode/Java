/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list3;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int A[]= {1, 2, 4, 10, 5, 7, 3, 8, 9, 12};
         
        char B[]= new char[A.length];
   
        for(int i=0; i<10; i++){
              if(A[i]<7){
                  B[i]= 'a';
                  
              } else if(A[i]==7){
                  B[i]='b';
              }else if (A[i]>7 && A[i]<10){
                  B[i]='c';
              }else if(A[i]==10){
                  B[i]='d';
              }else if(A[i]>10){
                B[i]='e';    
              }     
        }
        for(int i=0; i<10; i++){
            System.out.println(B[i]);
        }
        
    }
    
    
}
