package mc322.lab04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	private String dataSource;
	private String[] commands;
  
  public CSVReader() {
    this.commands = null;
    this.dataSource = null;
  }

  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
    if (dataSource == null) {
      commands = null;
    } else
      readCSV();
  }

  
  public String[] requestCommands() {
    return commands;
  }
  
  private void readCSV() {
    try {
      BufferedReader file = new BufferedReader(new FileReader(dataSource));
        
      String line = file.readLine();
      if (line != null) {
        commands = line.split(",");
        line = file.readLine();
      }
      file.close();
    } catch (IOException erro) {
      erro.printStackTrace();
    }
  }
  
}

public class AppRestaUm{

  String executaJogo(){
      CSVReader csv = new CSVReader();
      csv.setDataSource("../../../lab04/testes/teste0.csv");//modificar isso
      String commands[] = csv.requestCommands();
      String passos[] = new String[commands.lenght];
      Tabuleiro tabuleiro = new Tabuleiro();
      char comando[] = new char[5];//pega a string de comando em char
      for(int i = 0; i < commands.lenght; i++){
          comando = commands[i].toCharArray();
          if(i = 0){
              System.out.println("Tabuleiro inicial:");
              tabuleiro.saidaGrafico();
              System.out.println();
          }
          tabuleiro.conversao(commands[i]);
          System.out.println("Source: " + comando[0] + comando[1]);
          System.out.println("Target: " + comando[3] + comando[4]);
          tabuleiro.saidaGrafico();
          passos[i] = tabuleiro.saidaVetor();
      }
      return passos;
  }

  public static void main(){
      String passos[];
      passos = executarJogo();
  }
}