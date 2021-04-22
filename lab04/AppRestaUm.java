package mc322.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppRestaUm{


    static CSVReader csv = new CSVReader();
    public static String executaJogo(){
        csv.setDataSource("mc322/lab04/testes/teste01.csv");//modificar isso
        String commands[] = csv.requestCommands();
        String passos;
        Tabuleiro tabuleiro = new Tabuleiro();
        char comando[] = new char[5];//pega a string de comando em char
        passos = "";
        for(int i = 0; i < commands.length; i++){
            comando = commands[i].toCharArray();
            if(i == 0){
                System.out.println("Tabuleiro inicial:");
                tabuleiro.saidaGrafico();
                System.out.println();
            }
            tabuleiro.conversao(commands[i]);
            System.out.println("Source: " + comando[0] + comando[1]);
            System.out.println("Target: " + comando[3] + comando[4]);
            tabuleiro.saidaGrafico();
            passos += tabuleiro.saidaVetor();
        }
        return passos;
    }

    public static void main(String args[]){
        String passos;
        passos = executaJogo();
    }
}