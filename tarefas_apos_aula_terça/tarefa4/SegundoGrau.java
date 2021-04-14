package tarefas_apos_aula_terça.tarefa4;

public class SegundoGrau{
    int xi;
    int pot;

    SegundoGrau(int pXi, int pPot){
        this.xi = pXi;
        this.pot = pPot;
    }

    public int potencia(){
        int x;
        x = 1;
        for(int i = 0; i < pot+1; i++){
            if(i == 0){
                x = 1;
            }else{
                x *= xi;
            }
        }
        return x;
    }
}