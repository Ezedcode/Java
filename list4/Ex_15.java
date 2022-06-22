/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []names = {"Dino<----","Zedino<--","Ezedelio<"};
        byte []notes = {15, 16, 20};
        
        pauta(names, notes);
    }
    static void pauta(String []names, byte []notes){
        
        System.out.printf("Names<-------->Classifications\n");
        for(int i=0; i < names.length; i++){
            System.out.println("   "+names[i]+"-------->"+notes[i]);
        }
    }
}
