/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list4;

import java.util.ArrayList;
import java.util.Scanner;
import registros.LightAccount;

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
        String []months = {"Jan", "fev", "Mar", "Ap", "May", "Jun",
        "Jul", "Aug", "Sept", "Oct", "Nove", "Dec"};
        
        ArrayList<LightAccount> Months = new ArrayList<>();
        for(int i = 1; i <= 2; i++){
            Scanner key = new Scanner(System.in);
            LightAccount month = new LightAccount();
            
            System.out.println("Date which was realeze the read clock");
            System.out.print("day: ");
            month.dataReadClock.dia = key.nextInt();
            System.out.print("month: ");
            month.dataReadClock.month = months[key.nextInt()-1];
            System.out.print("year: ");
            month.dataReadClock.ano = key.nextInt();
            System.out.print("Enter the read of the clock light: ");
            month.readNumber = key.nextInt();
            System.out.print("Enter the amount of Spent money: ");
            month.moneySpentMonth = key.nextFloat();
            System.out.print("Enter the amount to pay: ");
            month.moneyToPay = key.nextFloat();
            System.out.println("Date of payment ");
            System.out.print("dia: ");
            month.payData.dia = key.nextInt();
            System.out.print("mes: ");
            month.payData.month = months[key.nextInt()-1];
            System.out.print("ano: ");
            month.payData.ano = key.nextInt();
            System.out.print("Enter the main of consumption: ");
            month.mediaConsumption = key.nextFloat();
            
            Months.add(month);
        }
        
    }
    
}
