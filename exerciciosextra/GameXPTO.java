/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosextra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import registros.Ranking;

/**
 *
 * @author Ezedélio Macuete Gar
 */
public class GameXPTO {
    /**
     * @param args t
     * 
     gghe command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<Ranking> Gamers = new ArrayList<>();
    
        for(;;){
            switch(menu()){
                case 'S':
                    char [][]table = new char[5][5];
                    Ranking Gamer = new Ranking();
                    table = full(table);
                    displayTable(table,7);
                    int result = GameOn(table, Gamers);
                    if(result != -1){
                        Gamer.points = result;
                        Gamer.dataHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        Gamers.add(Gamer);
                    }
                    break;
                case 'Z':
                    displayRanking(Gamers);
                    break;
                case 'E': 
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
    static int GameOn(char [][]table, ArrayList<Ranking> Gamers) throws IOException{
        int i=4, j=0, a=0, b=0, p=7, c=0, d=0;

        for (;;){
            Scanner key = new Scanner(System.in);
            System.out.print("Move player: ");
            String move = key.nextLine();
            System.out.println("");
            c=i;d=j;
            if("W".equalsIgnoreCase(move)){
                a=i-1;b=j;
                if(walk(a, b, table) == 0){
                    p--;
                    if(situation(a, b, p, table) == 1){
                        System.out.println("YOU Died");
                        table[i-1][j] = table[i][j];
                        table[i][j] = '.';
                        displayTable(table, p);
                        return -1;
                    }else if(situation(a, b, p, table) == 2){
                        double ale = Math.random();
                        p += (int)(3 + ale*(6-3));
                        table[i-1][j] = table[i][j];
                        table[i][j] = '.';
                        i--;
                    }else{
                        char aux = table[i][j];
                        table[i][j] = table[i-1][j];
                        table[i-1][j] = aux;
                        i--;
                    }

                }else{
                    System.out.println("No way out!");
                }
                displayTable(table, p);
                    
            }else if("S".equalsIgnoreCase(move)){
                a=i+1;b=j;
                if(walk(a, b, table) == 0){
                    p--;
                    if(situation(a, b, p, table) == 1){
                        System.out.println("YOU Died");
                        table[i+1][j] = table[i][j];
                        table[i][j] = '.';
                        displayTable(table, p);
                        return -1;
                    }
                    if(situation(a, b, p, table) == 2){
                        double ale = Math.random();
                        p += (int)(3 + ale*(6-3));
                        table[i+1][j] = table[i][j];
                        table[i][j] = '.';
                        i++;
                    }else{
                        char aux = table[i][j];
                        table[i][j] = table[i+1][j];
                        table[i+1][j] = aux;
                        i++;
                    }

                }else{
                    System.out.println("No way out!");
                }
                displayTable(table, p);
            }else if("A".equalsIgnoreCase(move)){
                a=i;b=j-1;
                if(walk(a, b, table) == 0){
                    p--;
                    if(situation(a, b, p, table) == 1){
                        System.out.println("YOU Died");
                        table[i][j-1] = table[i][j];
                        table[i][j] = '.';
                        displayTable(table, p);
                        return -1;
                    }else if(situation(a, b, p, table) == 2){
                        double ale = Math.random();
                        p += (int)(3 + ale*(6-3));
                        table[i][j-1] = table[i][j];
                        table[i][j] = '.';
                        j--;
                    }else{
                        char aux = table[i][j];
                        table[i][j] = table[i][j-1];
                        table[i][j-1] = aux;
                        j--;
                    }

                }else{
                    System.out.println("No way out!");
                }
                displayTable(table, p);
            }else if("D".equalsIgnoreCase(move)){
                a=i;b=j+1;
                if(walk(a, b, table) == 0){
                    p--;
                    if(situation(a, b, p, table) == 1){
                        System.out.println("YOU Died");
                        table[i][j+1] = table[i][j];
                        table[i][j] = '.';
                        displayTable(table, p);
                        return -1;
                    }else if(situation(a, b, p, table) == 2){
                        double ale = Math.random();
                        p += (int)(3 + ale*(6-3));
                        table[i][j+1] = table[i][j];
                        table[i][j] = '.';
                        j++;
                    }else{
                        char aux = table[i][j];
                        table[i][j] = table[i][j+1];
                        table[i][j+1] = aux;
                        j++;
                    }

                }else{
                    System.out.println("No way out!");
                }
                displayTable(table, p);
            }else if("Z".equalsIgnoreCase(move)){
                displayRanking(Gamers);
            }else{
                System.out.println("Invalid Option!");
            }   

            if(table[0][4] == 'J'){
                System.out.print("<--YOU WoN-->");
                table[c][d] = '.';
                displayTable(table, p);
                registerRanking(Gamers);
                break;
            }
        }

        return p;
    }

    static int randomPosition(){
        double ale = Math.random();
        int n = (int)(ale*(5)); 
        return n;
    }

    static int walk(int i, int j, char [][]table){
        if((i >= table.length) ||(i < 0)){
            return -1;
        }
        if((j < 0) || (j >= table.length)){
            return -1;
        }
        return 0;
    }
    
    static char[][] full(char [][]table){
        int count=0;
        table[4][0] = 'J';
        table[0][4] = 'F';

        for(;;){
            int a = randomPosition(), b = randomPosition();
            if((table[a][b] != 'F') && (table[a][b] != 'J')){
                table[a][b] = 'P';
                count++;
            }

            if(count == 1){
                break;
            }
        }
        
        double ale = Math.random();
        int n = (int)(2 + ale*(4-2));
        count = 0;
        
        for(;;){
            int a = randomPosition(), b = randomPosition();
            if((table[a][b] != 'F')&&(table[a][b] != 'J')&&(table[a][b] != 'P')&&(table[a][b] != 'B')){
                table[a][b] = 'B';
                count++;
            }

            if(count == n){
                break;
            }
        }
        
        for(int i=0; i < table.length; i++){
            for(int j=0; j < table.length; j++){
                if((table[i][j] != 'J')&&(table[i][j] != 'B')&&(table[i][j] != 'P')&&(table[i][j] != 'F')){
                    table[i][j] = '.';
                }
            }
        }
        
        return table;
    }

    static int situation(int i, int j, int p, char [][]table){
        if(table[i][j] == 'B'){
            return 1;
        }

        if((p == 0)&&(table[i][j] != 'P')&&(table[i][j] != 'F')){
            return 1;
        }else if((p == 0)&&(table[i][j] == 'P')){
            return 2;
        }

        if(table[i][j] == 'P'){
            return 2;
        }

        return 0;
    }
    
    static void displayTable(char [][]table, int p){
        System.out.printf("\nPoints: %d\n",p);
        for(int i=0; i < table.length; i++){
            System.out.print("     ");
            for(int j=0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
    
    static void displayRanking(ArrayList<Ranking> Gamers){
        Ranking []Aux = new Ranking[Gamers.size()];
        System.out.printf("\n<==RANKING==>\n");
        for(int i=0; i < Aux.length; i++){
            Aux[i] = Gamers.get(i);
        }
        for(int i=0; i < Aux.length; i++){
            System.out.println("Points: "+ Aux[i].points +", "+ Aux[i].dataHora.format(LocalDateTime.now()));
        }
    }
    
    static void registerRanking(ArrayList<Ranking> Gamers) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/exerciciosextra/pontos.txt", true));
        
        Ranking []Aux = new Ranking[Gamers.size()];
        bw.write("\n<==RANKING==>\n");
        for(int i=0; i < Aux.length; i++){
            Aux[i] = Gamers.get(i);
        }
        for(int i=0; i < Aux.length; i++){
            bw.write("Points: "+ Aux[i].points +", "+ Aux[i].dataHora.format(LocalDateTime.now()));
            bw.newLine();
        }
        //bw.write("" + dtf.format(LocalDateTime.now()));
        bw.close();
    }
        
    static char menu(){
        Scanner key = new Scanner(System.in);
        System.out.println("     MENU");
        System.out.println("S.Start the Game");
        System.out.println("Z.Show Ranking");
        System.out.println("E.Exit Game");
        System.out.print("Option: ");
        String option = key.nextLine();
        option = option.toUpperCase();
        
        return option.charAt(0);
    }
    
}
