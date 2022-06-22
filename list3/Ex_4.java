/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []arrayEn = {"car","sponsor","laptop","brother","mother","father"};//new String[100];
        String []arrayPt = {"carro","patrocinador","portatil","irmao","mae","pai"};//new String[100];
        ArrayList<String> arrayInfor =  new ArrayList<>();
        /*
        for(int i=0, j=0; i < 100; i++){
            Scanner key = new Scanner(System.in);
            System.out.print(j+".word: ");
            arrayEn[i] = key.nextLine();
            System.out.print(j+".palavra: ");
            arrayPt[i] = key.nextLine();
        }*/
        System.out.println("If you want to exit enter 1 else keep on to enter information!");
        for(;;){
            Scanner key = new Scanner(System.in);
            System.out.print("Enter the informatio: ");
            String inform = key.nextLine();
            arrayInfor.add(inform);
            if("1".equals(inform)){
                break;
            }
        }
        
        System.out.println("zedino");
    }
    
}
