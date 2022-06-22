/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list4;

import java.util.ArrayList;
import java.util.Scanner;
import registros.agenda;

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
        ArrayList<agenda> listP = new ArrayList<>();
        
        for(int i=0; i < 2; i++){
            Scanner key = new Scanner(System.in);
            agenda pessoa = new agenda();
            
            System.out.print("Digite nome: ");
            pessoa.nome = key.nextLine();
            System.out.print("Numero de telefone: ");
            pessoa.numerT = key.nextInt();
            System.out.println("Digite a Data");
            System.out.print("dia:");
            pessoa.dia = key.nextInt();
            System.out.print("mes:");
            pessoa.mes = key.nextInt();
            System.out.print("ano:");
            pessoa.ano = key.nextInt();
            listP.add(pessoa);
            System.out.println(" ");  
        }
        
        for(int i=0; i < listP.size(); i++){
            System.out.println("Nome: "+listP.get(i).nome);
            System.out.println("telefone: "+listP.get(i).numerT);
            System.out.println("Data");
            System.out.println("dia:"+listP.get(i).dia);
            System.out.println("mes:"+listP.get(i).mes);
            System.out.println("ano:"+listP.get(i).ano);
            System.out.println(" "); 
        }
        
    }
  
}
