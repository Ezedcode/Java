/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list6;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class Ex_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String []names = {"Dino<----","Zedino<--","Ezedelio<", "Dinog<---", "Dalcio<--", "Dalioneth<---"};
        byte []notes = {15, 16, 20, 21, 22, 25};
        pauta(names, notes);
    }
    static void pauta(String []names, byte []notes){
        int aux=0;
        byte aux3;
        String aux2="";
        
        for(int i=0; i < names.length; i++){
           for(int j=0; j<names.length; j++){
               aux=names[i].compareTo(names[j]);
               if(aux < 0){
                   aux2 = names[j];
                   names[j] = names[i];
                   names[i] = aux2;
                   
                   aux3 = notes[j];
                   notes[j] = notes[i];
                   notes[i] = aux3; 
               }
           }
        }
        System.out.printf("Names<-------->Classifications\n");
        for(int i=0; i < names.length; i++){
            System.out.println(" "+names[i]+"---------->"+notes[i]);
        }
    }
}
