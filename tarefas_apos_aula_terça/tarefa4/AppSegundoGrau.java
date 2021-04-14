package tarefas_apos_aula_terça.tarefa4;

public class AppSegundoGrau{
    public static void main(String args[]){
        Grafico g1 = new Grafico(true, '#');
        Grafico g2 = new Grafico(false, '*');

        SegundoGrau sg1 = new SegundoGrau(1, 4, 4, 7);
        SegundoGrau sg2 = new SegundoGrau(1, 1, 1, 7);

        sg1.segundoGrauGraf(g1);
        sg1.calculo();

        sg1.segundoGrauGraf(g2);
        sg1.calculo();

        sg2.segundoGrauGraf(g1);
        sg2.calculo();

        sg2.segundoGrauGraf(g2);
        sg2.calculo();
    }
}