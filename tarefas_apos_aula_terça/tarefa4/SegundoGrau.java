package tarefas_apos_aula_terça.tarefa4;

public class SegundoGrau{
    int a, b, c;
    int intervalo;
    Grafico graf;

    SegundoGrau(int pA, int pB, int pC, int pIntervalo){
        this.a = pA;
        this.b = pB;
        this.c = pC;
        this.intervalo = pIntervalo;
        graf = null;
    }

    public void segundoGrauGraf(Grafico graf){
        this.graf = graf;
    }

    public void calculo(){
        if(graf != null){
            int y;
            y = 0;
            for(int x = 0; x < intervalo; x++){
                y = a*(x*x) + b*x + c;
                graf.plotarGrafico(y);
            }
        }
    }
}