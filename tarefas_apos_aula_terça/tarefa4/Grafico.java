package tarefas_apos_aula_terça.tarefa4;

public class Grafico{
    boolean preen;
    char c;

    Grafico(boolean pPreen, char pC){
        this.c = pC;
        this.preen = pPreen;
    }

    public void plotarGrafico(int x){
        for(int i = 1; i < x; i++){
            if(preen == false){
                System.out.print(' ');
            }else{
                System.out.print(c);
            }
        }
        System.out.println(c);
    }
}