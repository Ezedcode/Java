/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list3;

import java.util.Scanner;

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
        int v[]= new int [10];
        int cont=0,cont1=0, cont2=0;
        System.out.println("digite o numero");
        Scanner numero = new Scanner(System.in);
        int n= numero.nextInt();
        System.out.println("Digite os valores do vetor");
        for(int j=0; j<10; j++){
            Scanner x = new Scanner(System.in);
            v[j]=x.nextInt();//para preencher o vetor
            
            if(v[j]>n)
               cont++; 
            if(v[j]<n)
                cont1++;
            if(v[j]==n)
                cont2++;
        }
        System.out.println("numeros maiores q x:"+cont);
        System.out.println("numeros menores q x:"+cont1);
        System.out.println("numeros igual q x:"+cont2);
    }
    
    
}
